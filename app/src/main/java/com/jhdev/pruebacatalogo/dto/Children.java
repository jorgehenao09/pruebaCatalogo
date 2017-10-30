package com.jhdev.pruebacatalogo.dto;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
/**
 * Awesome Pojo Generator
 * */
public class Children{
  @SerializedName("data")
  @Expose
  private Data data;
  @SerializedName("kind")
  @Expose
  private String kind;
  public void setData(Data data){
   this.data=data;
  }
  public Data getData(){
   return data;
  }
  public void setKind(String kind){
   this.kind=kind;
  }
  public String getKind(){
   return kind;
  }
}