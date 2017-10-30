package com.jhdev.pruebacatalogo.dto;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.jhdev.pruebacatalogo.dto.DataReddit;

/**
 * Awesome Pojo Generator
 * */
public class RedditResponse{
  @SerializedName("data")
  @Expose
  private DataReddit dataReddit;
  @SerializedName("kind")
  @Expose
  private String kind;
  public void setDataReddit(DataReddit dataReddit){
   this.dataReddit=dataReddit;
  }
  public DataReddit getDataReddit(){
   return dataReddit;
  }
  public void setKind(String kind){
   this.kind=kind;
  }
  public String getKind(){
   return kind;
  }
}