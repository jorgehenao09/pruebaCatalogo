package com.jhdev.pruebacatalogo.dto;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;
/**
 * Awesome Pojo Generator
 * */
public class DataReddit{
  @SerializedName("modhash")
  @Expose
  private String modhash;
  @SerializedName("children")
  @Expose
  private List<Children> children;
  @SerializedName("before")
  @Expose
  private Object before;
  @SerializedName("whitelist_status")
  @Expose
  private String whitelist_status;
  @SerializedName("after")
  @Expose
  private String after;
  public void setModhash(String modhash){
   this.modhash=modhash;
  }
  public String getModhash(){
   return modhash;
  }
  public void setChildren(List<Children> children){
   this.children=children;
  }
  public List<Children> getChildren(){
   return children;
  }
  public void setBefore(Object before){
   this.before=before;
  }
  public Object getBefore(){
   return before;
  }
  public void setWhitelist_status(String whitelist_status){
   this.whitelist_status=whitelist_status;
  }
  public String getWhitelist_status(){
   return whitelist_status;
  }
  public void setAfter(String after){
   this.after=after;
  }
  public String getAfter(){
   return after;
  }
}