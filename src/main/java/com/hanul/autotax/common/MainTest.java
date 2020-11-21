package com.hanul.autotax.common;

public class MainTest {
	
	public static void main(String[] args) throws Exception{
		
	    String id = "hackerljm";
	    String custrnmNo = "1234";
	    String custNm = "정묵테스트";		
		
        AES256Cipher a256 = AES256Cipher.getInstance();

        String enId = a256.AES_Encode(id);
        String enYyyymmdd = a256.AES_Encode(custrnmNo);
        String enCustNm = a256.AES_Encode(custNm);
        
        System.out.println(enId+ " "+ enYyyymmdd+" "+enCustNm);

        String desId = a256.AES_Decode(enId);
        String desYyyymmdd = a256.AES_Decode(enYyyymmdd);
        String desCustNm = a256.AES_Decode(enCustNm);	
        
        System.out.println(desId+ " "+ desYyyymmdd+" "+desCustNm);
		
	}
}
