/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridging;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.FileInputStream;
import java.util.Properties;
import javax.swing.JOptionPane;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author khanzasoft
 */
public class DUKCAPILBatamCekNIK {
    public String EKTP_STATUS="",NO_KK="",NIK="",NAMA_LGKP="",KAB_NAME="",AGAMA="",
            NO_RW="",KEC_NAME="",JENIS_PKRJN="",NO_RT="",NO_KEL="",ALAMAT="",NO_KEC="",
            TMPT_LHR="",PDDK_AKH="",STATUS_KAWIN="",NO_PROP="",NAMA_LGKP_IBU="",
            PROP_NAME="",NO_KAB="",KEL_NAME="",JENIS_KLMIN="",TGL_LHR="",
            requestJson="",stringbalik="",GOL_DARAH="";
    private final Properties prop = new Properties();
    
    public DUKCAPILBatamCekNIK(){
        super();
    }
    
    public void tampil(String nik) {
        try {
            prop.loadFromXML(new FileInputStream("setting/database.xml"));
            String URL = prop.getProperty("URLDUKCAPILBATAM")+"/CALL_NIK";	

	    HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
	    headers.add("Accept","application/json");
            requestJson="{"+
                          "\"nik\": \""+nik+"\"," +
                            "\"user_id\" : \""+prop.getProperty("USERDUKCAPILBATAM")+"\"," +
                            "\"password\": \""+prop.getProperty("PASSDUKCAPILBATAM")+"\"," +
                            "\"IP_USER\":\""+prop.getProperty("IPUSERDUKCAPILBATAM")+"\"" +
                            "}"; 
            //System.out.println("JSON dikirim : "+requestJson);
	    HttpEntity requestEntity = new HttpEntity(requestJson,headers);
	    RestTemplate rest = new RestTemplate();	
            
            ObjectMapper mapper = new ObjectMapper();
            stringbalik=rest.exchange(URL, HttpMethod.POST, requestEntity, String.class).getBody();
            //System.out.println("string balik : "+stringbalik);
            JsonNode root = mapper.readTree(stringbalik);
            JsonNode nameNode = root.path("content");
            if(nameNode.isArray()){
                for(JsonNode list:nameNode){                    
                    try {
                        if(list.path("RESPON").asText().equals("Data Tidak Ditemukan")){
                            JOptionPane.showMessageDialog(null,"Data Tidak Ditemukan");
                        }else if(list.path("RESPON").asText().equals("Login Gagal")){
                            JOptionPane.showMessageDialog(null,"Login Gagal");
                        }else if(list.path("RESPON").asText().equals("IP Address Tidak Sesuai")){
                            JOptionPane.showMessageDialog(null,"IP Address Tidak Sesuai");
                        }else if(list.path("RESPON").asText().equals("IP Client  Tidak terdaftar")){
                            JOptionPane.showMessageDialog(null,"IP Client  Tidak terdaftar");
                        }else if(list.path("RESPON").asText().equals("Kuota Akses Hari ini telah Habis")){
                            JOptionPane.showMessageDialog(null,"Kuota Akses Hari ini telah Habis");
                        }else{
                            EKTP_STATUS=list.path("EKTP_STATUS").asText();
                            NO_KK=list.path("NO_KK").asText();
                            NIK=list.path("NIK").asText();
                            NAMA_LGKP=list.path("NAMA_LGKP").asText();
                            KAB_NAME=list.path("KAB_NAME").asText();
                            AGAMA=list.path("AGAMA").asText();
                            NO_RW=list.path("NO_RW").asText();
                            KEC_NAME=list.path("KEC_NAME").asText();
                            JENIS_PKRJN=list.path("JENIS_PKRJN").asText();
                            NO_RT=list.path("NO_RT").asText();
                            NO_KEL=list.path("NO_KEL").asText();
                            ALAMAT=list.path("ALAMAT").asText();
                            NO_KEC=list.path("NO_KEC").asText();
                            TMPT_LHR=list.path("TMPT_LHR").asText();
                            PDDK_AKH=list.path("PDDK_AKH").asText();
                            STATUS_KAWIN=list.path("STATUS_KAWIN").asText();
                            NO_PROP=list.path("NO_PROP").asText();
                            NAMA_LGKP_IBU=list.path("NAMA_LGKP_IBU").asText();
                            PROP_NAME=list.path("PROP_NAME").asText();
                            NO_KAB=list.path("NO_KAB").asText();
                            KEL_NAME=list.path("KEL_NAME").asText();
                            JENIS_KLMIN=list.path("JENIS_KLMIN").asText();
                            GOL_DARAH=list.path("GOL_DARAH").asText();
                            TGL_LHR=list.path("TGL_LHR").asText();
                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null,e+" "+list.path("RESPON").asText());
                    }                            
                }
            }
        } catch (Exception ex) {
            System.out.println("Notifikasi : "+ex);
        }
    }
    
}
