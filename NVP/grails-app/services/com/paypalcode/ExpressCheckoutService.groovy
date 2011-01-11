package com.paypalcode
import org.codehaus.groovy.grails.commons.ConfigurationHolder
//https://cms.paypal.com/cms_content/US/en_US/files/developer/PP_NVPAPI_DeveloperGuide.pdf

class ExpressCheckoutService {
    def httpService
    static transactional = true
    def username =ConfigurationHolder.config.username
    def password = ConfigurationHolder.config.password
    def endpoint = ConfigurationHolder.config.endpoint
    def signature = ConfigurationHolder.config.signature
    def version = ConfigurationHolder.config.version
    /*its possible that a error may result from any number of 
     *reasons, recommending that setEC getEC and doEC be wrapped in 
     *try catch statements
     **/    
    Map setExpressCheckout(params){
        if(!params?.values().contains('SetExpressCheckout')){
            params['METHOD']="SetExpressCheckout"
        }
        httpService.getMapFromString(httpService.post(getCredentials()+httpService.mapToQueryString(params),endpoint))           
    }
    Map getExpressCheckout(String token){    
        httpService.getMapFromString(
            httpService.post(getCredentials()+"METHOD=GetExpressCheckoutDetails&TOKEN=${token}",endpoint)
        )
    }
    Map doExpressCheckout(params){
        if(!params?.values().contains('DoExpressCheckoutPayment')){
            params['METHOD']="DoExpressCheckoutPayment"
        }
         httpService.getMapFromString(
            httpService.post(getCredentials()+httpService.mapToQueryString(params),endpoint)
            )
    }
    
    Map doVoid(params){
        if(!params?.values().contains('doVoid')){params['METHOD']="doVoid"}
         httpService.getMapFromString(
             httpService.post(getCredentials()+httpService.mapToQueryString(params),endpoint)
             )
    }
    Map doReauthorization(params){
        if(!params?.values().contains('DoReauthorization')){
            params['METHOD']="DoReauthorization"
        }
        httpService.getMapFromString(
            httpService.post(getCredentials()+httpService.mapToQueryString(params),endpoint)
            )
    }
    Map doCapture(params){
         if(!params?.values().contains('DoCapture')){params['METHOD']="DoCapture"}
          httpService.getMapFromString(
              httpService.post(getCredentials()+httpService.mapToQueryString(params),endpoint)
              )
    }
    Map doAuthorization(params){
        if(!params?.values().contains('DoAuthorization')){
            params['METHOD']="DoAuthorization"
        }
        httpService.getMapFromString(
            httpService.post(getCredentials()+httpService.mapToQueryString(params),endpoint)
            )
        
    }
    Map RefundTransaction(){
        if(!params?.values().contains('RefundTransaction')){
            params['METHOD']="RefundTransaction"
        }
         httpService.getMapFromString(
             httpService.post(getCredentials()+httpService.mapToQueryString(params),endpoint)
             )
    }
    private String getCredentials(){
      "USER=${this.username}&PWD=${this.password}&SIGNATURE=${this.signature}&VERSION=${this.version}&"
    }
}
