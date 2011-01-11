package paypalec
import org.codehaus.groovy.grails.commons.ConfigurationHolder
//https://www.x.com/docs/DOC-1154

class ECTagLib {
  static namespace = "ppec"
  private provmap =    ['Alberta': 'AB','British Columbia': 'BC','Manitoba': 'MB', 'New Brunswick': 'NB','Newfoundland and Labrador': 'NL','Northwest Territories': 'NT','Nova Scotia': 'NS', 'Nunavut': 'NU','Ontario': 'ON','Prince Edward Island': 'PE','Quebec': 'QC','Saskatchewan': 'SK','Yukon': 'YT','Alabama': 'AL','Alaska': 'AK','American Samoa': 'AS','Arizona': 'AZ','Arkansas': 'AR','California': 'CA','Colorado': 'CO','Connecticut': 'CT','Delaware':'DE','District of Columbia': 'DC','Federated States of Micronesia': 'FM','Florida': 'FL','Georgia': 'GA','Guam': 'GU','Hawaii': 'HI','Idaho': 'ID' ,'Illinois': 'IL','Indiana':'IN','Iowa':'IA','Kansas':'KS','Kentucky':'KY','Louisiana':'LA','Maine':'ME','Marshall Islands':'MH','Maryland':'MD','Massachusetts':'MA','Michigan': 'MI','Minnesota':'MN','Mississippi':'MS','Missouri':'MO','Montana':'MT','Nebraska':'NE','Nevada':'NV','New Hampshire':'NH','New Jersey':'NJ','New Mexico':'NM','New York':'NY','North Carolina':'NC','North Dakota':'ND','Northern Mariana Islands': 'MP','Ohio': 'OH' ,'Oklahoma': 'OK','Oregon': 'OR','Palau':'PW','Pennsylvania':'PA','Puerto Rico':'PR', 'Rhode Island':'RI',
 'South Carolina':'SC', 'South Dakota':'SD', 'Tennessee':'TN',  'Texas':'TX', 'Utah': 'UT', 'Vermont': 'VT',
 'Virgin Islands':'VI', 'Virginia':'VA', 'Washington':'WA', 'West Virginia': 'WV',
 'Wisconsin':'WI', 'Wyoming': 'WY','Armed Forces Americas':'AA','Armed Forces':'AE','Armed Forces Pacific':'AP']
 
  private countryMap = ['AFGHANISTAN':'AF','ÅLAND':'AX','ALBANIA':'AL','ALGERIA':'DZ','AMERICAN':'AS','ANDORRA':'AD','ANGOLA':'AO','ANGUILLA':'AI','ANTARCTICA':'AQ','ANTIGUA':'AG','ARGENTINA':'AR','ARMENIA':'AM','ARUBA':'AW','AUSTRALIA':'AU','AUSTRIA':'AT','AZERBAIJAN':'AZ','BAHAMAS':'BS','BAHRAIN':'BH','BANGLADESH':'BD','BARBADOS':'BB','BELARUS':'BY','BELGIUM':'BE','BELIZE':'BZ','BENIN':'BJ','BERMUDA':'BM','BHUTAN':'BT','BOLIVIA':'BO','BOSNIA':'BA','BOTSWANA':'BW','BOUVET':'BV','BRAZIL':'BR','BRITISH':'IO','BRUNEI':'BN','BULGARIA':'BG','BURKINA':'BF','BURUNDI':'BI','CAMBODIA':'KH','CAMEROON':'CM','CANADA':'CA','CAPE':'CV','CAYMAN':'KY','CENTRAL':'CF','CHAD':'TD','CHILE':'CL','CHINA':'CN','CHRISTMAS':'CX','COCOS':'CC','COLOMBIA':'CO','COMOROS':'KM','CONGO':'CG','CONGO,':'CD','COOK':'CK','COSTA':'CR','COTE':'CI','CROATIA':'HR','CUBA':'CU','CYPRUS':'CY','CZECH':'CZ','DENMARK':'DK','DJIBOUTI':'DJ','DOMINICA':'DM','DOMINICAN':'DO','ECUADOR':'EC','EGYPT':'EG','EL':'SV','EQUATORIAL':'GQ','ERITREA':'ER','ESTONIA':'EE','ETHIOPIA':'ET','FALKLAND':'FK','FAROE':'FO','FIJI':'FJ','FINLAND':'FI','FRANCE':'FR','FRENCH':'GF','FRENCH':'PF','FRENCH':'TF','GABON':'GA','GAMBIA':'GM','GEORGIA':'GE','GERMANY':'DE','GHANA':'GH','GIBRALTAR':'GI','GREECE':'GR','GREENLAND':'GL','GRENADA':'GD','GUADELOUPE':'GP','GUAM':'GU','GUATEMALA':'GT','GUERNSEY':'GG','GUINEA':'GN','GUINEA-BISSAU':'GW','GUYANA':'GY','HAITI':'HT','HEARD':'HM','HOLY':'VA','HONDURAS':'HN','HONG':'HK','HUNGARY':'HU','ICELAND':'IS','INDIA':'IN','INDONESIA':'ID','IRAN,':'IR','IRAQ':'IQ','IRELAND':'IE','ISLE':'IM','ISRAEL':'IL','ITALY':'IT','JAMAICA':'JM','JAPAN':'JP','JERSEY':'JE','JORDAN':'JO','KAZAKHSTAN':'KZ','KENYA':'KE','KIRIBATI':'KI','KOREA,':'KP','KOREA,':'KR','KUWAIT':'KW','KYRGYZSTAN':'KG','LAO':'LA','LATVIA':'LV','LEBANON':'LB','LESOTHO':'LS','LIBERIA':'LR','LIBYAN':'LY','LIECHTENSTEIN':'LI','LITHUANIA':'LT','LUXEMBOURG':'LU','MACAO':'MO','MACEDONIA,':'MK','MADAGASCAR':'MG','MALAWI':'MW','MALAYSIA':'MY','MALDIVES':'MV','MALI':'ML','MALTA':'MT','MARSHALL':'MH','MARTINIQUE':'MQ','MAURITANIA':'MR','MAURITIUS':'MU','MAYOTTE':'YT','MEXICO':'MX','MICRONESIA,':'FM','MOLDOVA,':'MD','MONACO':'MC','MONGOLIA':'MN','MONTSERRAT':'MS','MOROCCO':'MA','MOZAMBIQUE':'MZ','MYANMAR':'MM','NAMIBIA':'NA','NAURU':'NR','NEPAL':'NP','NETHERLANDS':'NL','NETHERLANDS':'AN','NEW':'NC','NEW':'NZ','NICARAGUA':'NI','NIGER':'NE','NIGERIA':'NG','NIUE':'NU','NORFOLK':'NF','NORTHERN':'MP','NORWAY':'NO','OMAN':'OM','PAKISTAN':'PK','PALAU':'PW','PALESTINIAN':'PS','PANAMA':'PA','PAPUA':'PG','PARAGUAY':'PY','PERU':'PE','PHILIPPINES':'PH','PITCAIRN':'PN','POLAND':'PL','PORTUGAL':'PT','PUERTO':'PR','QATAR':'QA','REUNION':'RE','ROMANIA':'RO','RUSSIAN':'RU','RWANDA':'RW','SAINT':'SH','SAINT':'KN','SAINT':'LC','SAINT':'PM','SAINT':'VC','SAMOA':'WS','SAN':'SM','SAO':'ST','SAUDI':'SA','SENEGAL':'SN','SERBIA':'CS','SEYCHELLES':'SC','SIERRA':'SL','SINGAPORE':'SG','SLOVAKIA':'SK','SLOVENIA':'SI','SOLOMON':'SB','SOMALIA':'SO','SOUTH':'ZA','SOUTH':'GS','SPAIN':'ES','SRI':'LK','SUDAN':'SD','SURINAME':'SR','SVALBARD':'SJ','SWAZILAND':'SZ','SWEDEN':'SE','SWITZERLAND':'CH','SYRIAN':'SY','TAIWAN,':'TW','TAJIKISTAN':'TJ','TANZANIA,':'TZ','THAILAND':'TH','TIMOR-LESTE':'TL','TOGO':'TG','TOKELAU':'TK','TONGA':'TO','TRINIDAD':'TT','TUNISIA':'TN','TURKEY':'TR','TURKMENISTAN':'TM','TURKS':'TC','TUVALU':'TV','UGANDA':'UG','UKRAINE':'UA','UNITED':'AE','UNITED':'GB','UNITED':'US','UNITED':'UM','URUGUAY':'UY','UZBEKISTAN':'UZ','VANUATU':'VU','VENEZUELA':'VE','VIET':'VN','VIRGIN':'VG','VIRGIN':'VI','WALLIS':'WF','WESTERN':'EH','YEMEN':'YE','ZAMBIA':'ZM','ZIMBABWE':'ZW']
  
  def countrycodes = {attrs,body ->
    out<<'<select>'+
        countryMap.collect{k,v->"<option value='${v}'>${k}</option>" }.join("")+
        '</select>'
    }
  def statecodes = {attrs,body->
       out<<'<select>'+
        provmap.collect{k,v->"<option value='${v}'>${k}</option>" }.join("")+
        '</select>'
  }
  //convienience tag for testing,expects a token parameter
  def redirectToPayPalLink = {attrs,body->
      String endpoint="" 
      if(ConfigurationHolder.config.endpoint.toUpperCase() =~ "SANDBOX"){
          endpoint=".sandbox"
      }
   out<<"""<a href='https://www${endpoint}.paypal.com/webscr?cmd=_express-checkout&token=${attrs.token}'>redirect to PayPal</a>"""
   
  }
  
  def paypalMark = {attrs,body->
    def sizes=['tiny':[37,23],'small':[50,34],'medium':[60,38],'large':[180,113]]
   
    out << """<!-- PayPal Logo --><table border="0" cellpadding="10" cellspacing="0" align="center"><tr><td align="center"></td></tr>
    <tr><td align="center"><a href="#" onclick="javascript:window.open('https://www.paypal.com/cgi-bin/webscr?cmd=xpt/Marketing/popup/OLCWhatIsPayPal-outside','olcwhatispaypal','toolbar=no, location=no, directories=no, status=no, menubar=no, scrollbars=yes, resizable=yes, width=400, height=350');">
    <img  src="https://www.paypal.com/en_US/i/logo/PayPal_mark_${sizes[attrs.picSize][0]}x${sizes[attrs.picSize][1]}.gif" border="0" alt="Acceptance Mark"></a></td></tr></table><!-- PayPal Logo -->"""
    }
    /**
     *accept 'vertical or horizontal alignment argument
    **/
  def solutionLogo={attrs,body->   
    out << """<!-- PayPal Logo --><table border="0" cellpadding="10" cellspacing="0" align="center"><tr><td align="center"></td></tr>
        <tr><td align="center"><a href="#" onclick="javascript:window.open('https://www.paypal.com/cgi-bin/webscr?cmd=xpt/Marketing/popup/OLCWhatIsPayPal-outside','olcwhatispaypal','toolbar=no, location=no, directories=no, status=no, menubar=no, scrollbars=yes, resizable=yes, width=400, height=350');"><img  src="https://www.paypal.com/en_US/i/bnr/${ attrs.alignment}_solution_PPeCheck.gif" border="0" alt="Solution Graphics"></a></td></tr></table><!-- PayPal Logo -->"""
    }    
}
