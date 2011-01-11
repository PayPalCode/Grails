package com.paypalcode
import org.codehaus.groovy.grails.commons.ConfigurationHolder
class InstantPaymentNotificationService {
    def httpService
    static transactional = true
    def ipnEndpoint = ConfigurationHolder.config.ipnURL
    
    def postIPNBackToPayPal(params){
        httpService.post("cmd=_notify-validate&"+params.collect{k,v->"${k}=${v}"}.join("&"),ipnEndpoint)
    }
}
