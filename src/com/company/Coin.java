package com.company;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Coin{
    Coin(String OldValue,String NowValue)
    {
        this.NowValue=NowValue;
        this.OldValue=OldValue;
        old_pk=GetPK(OldValue);
        now_pk=GetPK(NowValue);
        old_hash=GetSignature(OldValue);
        now_hash=GetSignature(NowValue);
        Useful=CheckItself();
    }
    int index;
    public String NowValue;
    public String OldValue;
    public boolean Useful =false;

    private String now_pk;
    private String old_pk;
    private String now_hash;
    private String old_hash;

    private boolean CheckItself(){
        return (check_hash(now_hash,OldValue,now_pk)&&check_signature(this.now_hash,this.old_pk));
    }
    public String ValueForGive(String Value,String PKey) {
        String NValue=null;



        if(NValue!=null)
            return NValue;
        else return null;
    }
    private String ValueForGet(String Value,String PKey) {
        return null;
    }
    private String stringToMD5(String plainText) {
        byte[] secretBytes = null;
        try {
            secretBytes = MessageDigest.getInstance("md5").digest(
                    plainText.getBytes());
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("没有这个md5算法！");
        }
        String md5code = new BigInteger(1, secretBytes).toString(16);
        for (int i = 0; i < 32 - md5code.length(); i++) {
            md5code = "0" + md5code;
        }
        return md5code;
    }
    private String GetPK(String CoinValue){
        return null;
    }
    private String GetSignature(String CoinValue){
        return null;
    }
    private boolean check_signature(String signature,String Pk){
        return false;
    }
    private boolean check_hash(String hash,String oldValue,String new_pk){
        return false;
    }
    public boolean UpdateToDataBase()
    {
        return false;
    }

}