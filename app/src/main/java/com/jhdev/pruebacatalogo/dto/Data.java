package com.jhdev.pruebacatalogo.dto;
import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;
/**
 * Awesome Pojo Generator
 * */
public class Data implements Parcelable{
  @SerializedName("public_description")
  @Expose
  private String public_description;
  @SerializedName("key_color")
  @Expose
  private String key_color;
  @SerializedName("active_user_count")
  @Expose
  private Object active_user_count;
  @SerializedName("accounts_active")
  @Expose
  private Object accounts_active;
  @SerializedName("user_is_banned")
  @Expose
  private Object user_is_banned;
  @SerializedName("submit_text_label")
  @Expose
  private String submit_text_label;
  @SerializedName("user_is_muted")
  @Expose
  private Object user_is_muted;
  @SerializedName("public_description_html")
  @Expose
  private String public_description_html;
  @SerializedName("whitelist_status")
  @Expose
  private String whitelist_status;
  @SerializedName("user_is_subscriber")
  @Expose
  private Object user_is_subscriber;
  @SerializedName("icon_size")
  @Expose
  private List<Object> icon_size;
  @SerializedName("id")
  @Expose
  private String id;
  @SerializedName("user_flair_enabled_in_sr")
  @Expose
  private Boolean user_flair_enabled_in_sr;
  @SerializedName("show_media")
  @Expose
  private Boolean show_media;
  @SerializedName("created_utc")
  @Expose
  private Integer created_utc;
  @SerializedName("comment_score_hide_mins")
  @Expose
  private Integer comment_score_hide_mins;
  @SerializedName("is_enrolled_in_new_modmail")
  @Expose
  private Object is_enrolled_in_new_modmail;
  @SerializedName("header_title")
  @Expose
  private String header_title;
  @SerializedName("subscribers")
  @Expose
  private Integer subscribers;
  @SerializedName("created")
  @Expose
  private Integer created;
  @SerializedName("display_name")
  @Expose
  private String display_name;
  @SerializedName("user_is_contributor")
  @Expose
  private Object user_is_contributor;
  @SerializedName("link_flair_enabled")
  @Expose
  private Boolean link_flair_enabled;
  @SerializedName("submit_link_label")
  @Expose
  private Object submit_link_label;
  @SerializedName("banner_img")
  @Expose
  private String banner_img;
  @SerializedName("user_flair_css_class")
  @Expose
  private Object user_flair_css_class;
  @SerializedName("name")
  @Expose
  private String name;
  @SerializedName("description_html")
  @Expose
  private String description_html;
  @SerializedName("audience_target")
  @Expose
  private String audience_target;
  @SerializedName("user_sr_flair_enabled")
  @Expose
  private Object user_sr_flair_enabled;
  @SerializedName("suggested_comment_sort")
  @Expose
  private Object suggested_comment_sort;
  @SerializedName("submit_text")
  @Expose
  private String submit_text;
  @SerializedName("user_has_favorited")
  @Expose
  private Object user_has_favorited;
  @SerializedName("accounts_active_is_fuzzed")
  @Expose
  private Boolean accounts_active_is_fuzzed;
  @SerializedName("allow_images")
  @Expose
  private Boolean allow_images;
  @SerializedName("public_traffic")
  @Expose
  private Boolean public_traffic;
  @SerializedName("description")
  @Expose
  private String description;
  @SerializedName("user_flair_text")
  @Expose
  private Object user_flair_text;
  @SerializedName("title")
  @Expose
  private String title;
  @SerializedName("display_name_prefixed")
  @Expose
  private String display_name_prefixed;
  @SerializedName("submission_type")
  @Expose
  private String submission_type;
  @SerializedName("user_sr_theme_enabled")
  @Expose
  private Boolean user_sr_theme_enabled;
  @SerializedName("spoilers_enabled")
  @Expose
  private Boolean spoilers_enabled;
  @SerializedName("show_media_preview")
  @Expose
  private Boolean show_media_preview;
  @SerializedName("lang")
  @Expose
  private String lang;
  @SerializedName("user_is_moderator")
  @Expose
  private Object user_is_moderator;
  @SerializedName("allow_discovery")
  @Expose
  private Boolean allow_discovery;
  @SerializedName("over18")
  @Expose
  private Boolean over18;
  @SerializedName("banner_size")
  @Expose
  private List<Object> banner_size;
  @SerializedName("subreddit_type")
  @Expose
  private String subreddit_type;
  @SerializedName("collapse_deleted_comments")
  @Expose
  private Boolean collapse_deleted_comments;
  @SerializedName("header_size")
  @Expose
  private List<Object> header_size;
  @SerializedName("advertiser_category")
  @Expose
  private String advertiser_category;
  @SerializedName("url")
  @Expose
  private String url;
  @SerializedName("user_can_flair_in_sr")
  @Expose
  private Object user_can_flair_in_sr;
  @SerializedName("header_img")
  @Expose
  private String header_img;
  @SerializedName("icon_img")
  @Expose
  private String icon_img;
  @SerializedName("submit_text_html")
  @Expose
  private String submit_text_html;
  @SerializedName("wiki_enabled")
  @Expose
  private Boolean wiki_enabled;
  @SerializedName("quarantine")
  @Expose
  private Boolean quarantine;
  @SerializedName("hide_ads")
  @Expose
  private Boolean hide_ads;

    protected Data(Parcel in) {
        public_description = in.readString();
        key_color = in.readString();
        submit_text_label = in.readString();
        public_description_html = in.readString();
        whitelist_status = in.readString();
        id = in.readString();
        byte tmpUser_flair_enabled_in_sr = in.readByte();
        user_flair_enabled_in_sr = tmpUser_flair_enabled_in_sr == 0 ? null : tmpUser_flair_enabled_in_sr == 1;
        byte tmpShow_media = in.readByte();
        show_media = tmpShow_media == 0 ? null : tmpShow_media == 1;
        if (in.readByte() == 0) {
            created_utc = null;
        } else {
            created_utc = in.readInt();
        }
        if (in.readByte() == 0) {
            comment_score_hide_mins = null;
        } else {
            comment_score_hide_mins = in.readInt();
        }
        header_title = in.readString();
        if (in.readByte() == 0) {
            subscribers = null;
        } else {
            subscribers = in.readInt();
        }
        if (in.readByte() == 0) {
            created = null;
        } else {
            created = in.readInt();
        }
        display_name = in.readString();
        byte tmpLink_flair_enabled = in.readByte();
        link_flair_enabled = tmpLink_flair_enabled == 0 ? null : tmpLink_flair_enabled == 1;
        banner_img = in.readString();
        name = in.readString();
        description_html = in.readString();
        audience_target = in.readString();
        submit_text = in.readString();
        byte tmpAccounts_active_is_fuzzed = in.readByte();
        accounts_active_is_fuzzed = tmpAccounts_active_is_fuzzed == 0 ? null : tmpAccounts_active_is_fuzzed == 1;
        byte tmpAllow_images = in.readByte();
        allow_images = tmpAllow_images == 0 ? null : tmpAllow_images == 1;
        byte tmpPublic_traffic = in.readByte();
        public_traffic = tmpPublic_traffic == 0 ? null : tmpPublic_traffic == 1;
        description = in.readString();
        title = in.readString();
        display_name_prefixed = in.readString();
        submission_type = in.readString();
        byte tmpUser_sr_theme_enabled = in.readByte();
        user_sr_theme_enabled = tmpUser_sr_theme_enabled == 0 ? null : tmpUser_sr_theme_enabled == 1;
        byte tmpSpoilers_enabled = in.readByte();
        spoilers_enabled = tmpSpoilers_enabled == 0 ? null : tmpSpoilers_enabled == 1;
        byte tmpShow_media_preview = in.readByte();
        show_media_preview = tmpShow_media_preview == 0 ? null : tmpShow_media_preview == 1;
        lang = in.readString();
        byte tmpAllow_discovery = in.readByte();
        allow_discovery = tmpAllow_discovery == 0 ? null : tmpAllow_discovery == 1;
        byte tmpOver18 = in.readByte();
        over18 = tmpOver18 == 0 ? null : tmpOver18 == 1;
        subreddit_type = in.readString();
        byte tmpCollapse_deleted_comments = in.readByte();
        collapse_deleted_comments = tmpCollapse_deleted_comments == 0 ? null : tmpCollapse_deleted_comments == 1;
        advertiser_category = in.readString();
        url = in.readString();
        header_img = in.readString();
        icon_img = in.readString();
        submit_text_html = in.readString();
        byte tmpWiki_enabled = in.readByte();
        wiki_enabled = tmpWiki_enabled == 0 ? null : tmpWiki_enabled == 1;
        byte tmpQuarantine = in.readByte();
        quarantine = tmpQuarantine == 0 ? null : tmpQuarantine == 1;
        byte tmpHide_ads = in.readByte();
        hide_ads = tmpHide_ads == 0 ? null : tmpHide_ads == 1;
    }

    public static final Creator<Data> CREATOR = new Creator<Data>() {
        @Override
        public Data createFromParcel(Parcel in) {
            return new Data(in);
        }

        @Override
        public Data[] newArray(int size) {
            return new Data[size];
        }
    };

    public void setPublic_description(String public_description){
   this.public_description=public_description;
  }
  public String getPublic_description(){
   return public_description;
  }
  public void setKey_color(String key_color){
   this.key_color=key_color;
  }
  public String getKey_color(){
   return key_color;
  }
  public void setActive_user_count(Object active_user_count){
   this.active_user_count=active_user_count;
  }
  public Object getActive_user_count(){
   return active_user_count;
  }
  public void setAccounts_active(Object accounts_active){
   this.accounts_active=accounts_active;
  }
  public Object getAccounts_active(){
   return accounts_active;
  }
  public void setUser_is_banned(Object user_is_banned){
   this.user_is_banned=user_is_banned;
  }
  public Object getUser_is_banned(){
   return user_is_banned;
  }
  public void setSubmit_text_label(String submit_text_label){
   this.submit_text_label=submit_text_label;
  }
  public String getSubmit_text_label(){
   return submit_text_label;
  }
  public void setUser_is_muted(Object user_is_muted){
   this.user_is_muted=user_is_muted;
  }
  public Object getUser_is_muted(){
   return user_is_muted;
  }
  public void setPublic_description_html(String public_description_html){
   this.public_description_html=public_description_html;
  }
  public String getPublic_description_html(){
   return public_description_html;
  }
  public void setWhitelist_status(String whitelist_status){
   this.whitelist_status=whitelist_status;
  }
  public String getWhitelist_status(){
   return whitelist_status;
  }
  public void setUser_is_subscriber(Object user_is_subscriber){
   this.user_is_subscriber=user_is_subscriber;
  }
  public Object getUser_is_subscriber(){
   return user_is_subscriber;
  }
  public void setIcon_size(List<Object> icon_size){
   this.icon_size=icon_size;
  }
  public List<Object> getIcon_size(){
   return icon_size;
  }
  public void setId(String id){
   this.id=id;
  }
  public String getId(){
   return id;
  }
  public void setUser_flair_enabled_in_sr(Boolean user_flair_enabled_in_sr){
   this.user_flair_enabled_in_sr=user_flair_enabled_in_sr;
  }
  public Boolean getUser_flair_enabled_in_sr(){
   return user_flair_enabled_in_sr;
  }
  public void setShow_media(Boolean show_media){
   this.show_media=show_media;
  }
  public Boolean getShow_media(){
   return show_media;
  }
  public void setCreated_utc(Integer created_utc){
   this.created_utc=created_utc;
  }
  public Integer getCreated_utc(){
   return created_utc;
  }
  public void setComment_score_hide_mins(Integer comment_score_hide_mins){
   this.comment_score_hide_mins=comment_score_hide_mins;
  }
  public Integer getComment_score_hide_mins(){
   return comment_score_hide_mins;
  }
  public void setIs_enrolled_in_new_modmail(Object is_enrolled_in_new_modmail){
   this.is_enrolled_in_new_modmail=is_enrolled_in_new_modmail;
  }
  public Object getIs_enrolled_in_new_modmail(){
   return is_enrolled_in_new_modmail;
  }
  public void setHeader_title(String header_title){
   this.header_title=header_title;
  }
  public String getHeader_title(){
   return header_title;
  }
  public void setSubscribers(Integer subscribers){
   this.subscribers=subscribers;
  }
  public Integer getSubscribers(){
   return subscribers;
  }
  public void setCreated(Integer created){
   this.created=created;
  }
  public Integer getCreated(){
   return created;
  }
  public void setDisplay_name(String display_name){
   this.display_name=display_name;
  }
  public String getDisplay_name(){
   return display_name;
  }
  public void setUser_is_contributor(Object user_is_contributor){
   this.user_is_contributor=user_is_contributor;
  }
  public Object getUser_is_contributor(){
   return user_is_contributor;
  }
  public void setLink_flair_enabled(Boolean link_flair_enabled){
   this.link_flair_enabled=link_flair_enabled;
  }
  public Boolean getLink_flair_enabled(){
   return link_flair_enabled;
  }
  public void setSubmit_link_label(Object submit_link_label){
   this.submit_link_label=submit_link_label;
  }
  public Object getSubmit_link_label(){
   return submit_link_label;
  }
  public void setBanner_img(String banner_img){
   this.banner_img=banner_img;
  }
  public String getBanner_img(){
   return banner_img;
  }
  public void setUser_flair_css_class(Object user_flair_css_class){
   this.user_flair_css_class=user_flair_css_class;
  }
  public Object getUser_flair_css_class(){
   return user_flair_css_class;
  }
  public void setName(String name){
   this.name=name;
  }
  public String getName(){
   return name;
  }
  public void setDescription_html(String description_html){
   this.description_html=description_html;
  }
  public String getDescription_html(){
   return description_html;
  }
  public void setAudience_target(String audience_target){
   this.audience_target=audience_target;
  }
  public String getAudience_target(){
   return audience_target;
  }
  public void setUser_sr_flair_enabled(Object user_sr_flair_enabled){
   this.user_sr_flair_enabled=user_sr_flair_enabled;
  }
  public Object getUser_sr_flair_enabled(){
   return user_sr_flair_enabled;
  }
  public void setSuggested_comment_sort(Object suggested_comment_sort){
   this.suggested_comment_sort=suggested_comment_sort;
  }
  public Object getSuggested_comment_sort(){
   return suggested_comment_sort;
  }
  public void setSubmit_text(String submit_text){
   this.submit_text=submit_text;
  }
  public String getSubmit_text(){
   return submit_text;
  }
  public void setUser_has_favorited(Object user_has_favorited){
   this.user_has_favorited=user_has_favorited;
  }
  public Object getUser_has_favorited(){
   return user_has_favorited;
  }
  public void setAccounts_active_is_fuzzed(Boolean accounts_active_is_fuzzed){
   this.accounts_active_is_fuzzed=accounts_active_is_fuzzed;
  }
  public Boolean getAccounts_active_is_fuzzed(){
   return accounts_active_is_fuzzed;
  }
  public void setAllow_images(Boolean allow_images){
   this.allow_images=allow_images;
  }
  public Boolean getAllow_images(){
   return allow_images;
  }
  public void setPublic_traffic(Boolean public_traffic){
   this.public_traffic=public_traffic;
  }
  public Boolean getPublic_traffic(){
   return public_traffic;
  }
  public void setDescription(String description){
   this.description=description;
  }
  public String getDescription(){
   return description;
  }
  public void setUser_flair_text(Object user_flair_text){
   this.user_flair_text=user_flair_text;
  }
  public Object getUser_flair_text(){
   return user_flair_text;
  }
  public void setTitle(String title){
   this.title=title;
  }
  public String getTitle(){
   return title;
  }
  public void setDisplay_name_prefixed(String display_name_prefixed){
   this.display_name_prefixed=display_name_prefixed;
  }
  public String getDisplay_name_prefixed(){
   return display_name_prefixed;
  }
  public void setSubmission_type(String submission_type){
   this.submission_type=submission_type;
  }
  public String getSubmission_type(){
   return submission_type;
  }
  public void setUser_sr_theme_enabled(Boolean user_sr_theme_enabled){
   this.user_sr_theme_enabled=user_sr_theme_enabled;
  }
  public Boolean getUser_sr_theme_enabled(){
   return user_sr_theme_enabled;
  }
  public void setSpoilers_enabled(Boolean spoilers_enabled){
   this.spoilers_enabled=spoilers_enabled;
  }
  public Boolean getSpoilers_enabled(){
   return spoilers_enabled;
  }
  public void setShow_media_preview(Boolean show_media_preview){
   this.show_media_preview=show_media_preview;
  }
  public Boolean getShow_media_preview(){
   return show_media_preview;
  }
  public void setLang(String lang){
   this.lang=lang;
  }
  public String getLang(){
   return lang;
  }
  public void setUser_is_moderator(Object user_is_moderator){
   this.user_is_moderator=user_is_moderator;
  }
  public Object getUser_is_moderator(){
   return user_is_moderator;
  }
  public void setAllow_discovery(Boolean allow_discovery){
   this.allow_discovery=allow_discovery;
  }
  public Boolean getAllow_discovery(){
   return allow_discovery;
  }
  public void setOver18(Boolean over18){
   this.over18=over18;
  }
  public Boolean getOver18(){
   return over18;
  }
  public void setBanner_size(List<Object> banner_size){
   this.banner_size=banner_size;
  }
  public List<Object> getBanner_size(){
   return banner_size;
  }
  public void setSubreddit_type(String subreddit_type){
   this.subreddit_type=subreddit_type;
  }
  public String getSubreddit_type(){
   return subreddit_type;
  }
  public void setCollapse_deleted_comments(Boolean collapse_deleted_comments){
   this.collapse_deleted_comments=collapse_deleted_comments;
  }
  public Boolean getCollapse_deleted_comments(){
   return collapse_deleted_comments;
  }
  public void setHeader_size(List<Object> header_size){
   this.header_size=header_size;
  }
  public List<Object> getHeader_size(){
   return header_size;
  }
  public void setAdvertiser_category(String advertiser_category){
   this.advertiser_category=advertiser_category;
  }
  public String getAdvertiser_category(){
   return advertiser_category;
  }
  public void setUrl(String url){
   this.url=url;
  }
  public String getUrl(){
   return url;
  }
  public void setUser_can_flair_in_sr(Object user_can_flair_in_sr){
   this.user_can_flair_in_sr=user_can_flair_in_sr;
  }
  public Object getUser_can_flair_in_sr(){
   return user_can_flair_in_sr;
  }
  public void setHeader_img(String header_img){
   this.header_img=header_img;
  }
  public String getHeader_img(){
   return header_img;
  }
  public void setIcon_img(String icon_img){
   this.icon_img=icon_img;
  }
  public String getIcon_img(){
   return icon_img;
  }
  public void setSubmit_text_html(String submit_text_html){
   this.submit_text_html=submit_text_html;
  }
  public String getSubmit_text_html(){
   return submit_text_html;
  }
  public void setWiki_enabled(Boolean wiki_enabled){
   this.wiki_enabled=wiki_enabled;
  }
  public Boolean getWiki_enabled(){
   return wiki_enabled;
  }
  public void setQuarantine(Boolean quarantine){
   this.quarantine=quarantine;
  }
  public Boolean getQuarantine(){
   return quarantine;
  }
  public void setHide_ads(Boolean hide_ads){
   this.hide_ads=hide_ads;
  }
  public Boolean getHide_ads(){
   return hide_ads;
  }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(public_description);
        parcel.writeString(key_color);
        parcel.writeString(submit_text_label);
        parcel.writeString(public_description_html);
        parcel.writeString(whitelist_status);
        parcel.writeString(id);
        parcel.writeByte((byte) (user_flair_enabled_in_sr == null ? 0 : user_flair_enabled_in_sr ? 1 : 2));
        parcel.writeByte((byte) (show_media == null ? 0 : show_media ? 1 : 2));
        if (created_utc == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(created_utc);
        }
        if (comment_score_hide_mins == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(comment_score_hide_mins);
        }
        parcel.writeString(header_title);
        if (subscribers == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(subscribers);
        }
        if (created == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(created);
        }
        parcel.writeString(display_name);
        parcel.writeByte((byte) (link_flair_enabled == null ? 0 : link_flair_enabled ? 1 : 2));
        parcel.writeString(banner_img);
        parcel.writeString(name);
        parcel.writeString(description_html);
        parcel.writeString(audience_target);
        parcel.writeString(submit_text);
        parcel.writeByte((byte) (accounts_active_is_fuzzed == null ? 0 : accounts_active_is_fuzzed ? 1 : 2));
        parcel.writeByte((byte) (allow_images == null ? 0 : allow_images ? 1 : 2));
        parcel.writeByte((byte) (public_traffic == null ? 0 : public_traffic ? 1 : 2));
        parcel.writeString(description);
        parcel.writeString(title);
        parcel.writeString(display_name_prefixed);
        parcel.writeString(submission_type);
        parcel.writeByte((byte) (user_sr_theme_enabled == null ? 0 : user_sr_theme_enabled ? 1 : 2));
        parcel.writeByte((byte) (spoilers_enabled == null ? 0 : spoilers_enabled ? 1 : 2));
        parcel.writeByte((byte) (show_media_preview == null ? 0 : show_media_preview ? 1 : 2));
        parcel.writeString(lang);
        parcel.writeByte((byte) (allow_discovery == null ? 0 : allow_discovery ? 1 : 2));
        parcel.writeByte((byte) (over18 == null ? 0 : over18 ? 1 : 2));
        parcel.writeString(subreddit_type);
        parcel.writeByte((byte) (collapse_deleted_comments == null ? 0 : collapse_deleted_comments ? 1 : 2));
        parcel.writeString(advertiser_category);
        parcel.writeString(url);
        parcel.writeString(header_img);
        parcel.writeString(icon_img);
        parcel.writeString(submit_text_html);
        parcel.writeByte((byte) (wiki_enabled == null ? 0 : wiki_enabled ? 1 : 2));
        parcel.writeByte((byte) (quarantine == null ? 0 : quarantine ? 1 : 2));
        parcel.writeByte((byte) (hide_ads == null ? 0 : hide_ads ? 1 : 2));
    }
}