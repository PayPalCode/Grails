package com.paypalcode

class HttpService {

    static transactional = true

    def post( String query, String endpoint) {
        // println "posting to paypal ${endpoint}\n${queryString}"
        //end point = from datasource conf
        def url = new URL( endpoint )
        def connection = url.openConnection()
        connection.setRequestMethod("POST" )        
        connection.doOutput = true
        Writer writer = new OutputStreamWriter(connection.outputStream)
        writer.write(query)
        writer.flush()
        writer.close()
        connection.connect()
        return connection.content.text
    }
    def mapToQueryString(queryMap){
        queryMap.collect{k,v->"${k}=${v}"}.join("&")
    }
     def getMapFromString(String query){
        def retmap=[:]
        query.split("&").each{
           def tmp= it.split("=") 
           retmap[tmp[0]]=tmp[1]
           }        
        return retmap
    }
}
