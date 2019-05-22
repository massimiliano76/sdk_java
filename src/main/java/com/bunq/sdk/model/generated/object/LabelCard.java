package com.bunq.sdk.model.generated.object;

import com.bunq.sdk.model.core.BunqModel;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

/**
 */
public class LabelCard extends BunqModel {

  /**
   * The public UUID.
   */
  @Expose
  @SerializedName("uuid")
  private String uuid;

  /**
   * The type of the card.
   */
  @Expose
  @SerializedName("type")
  private String type;

  /**
   * The second line on the card.
   */
  @Expose
  @SerializedName("second_line")
  private String secondLine;

  /**
   * The date this card will expire.
   */
  @Expose
  @SerializedName("expiry_date")
  private String expiryDate;

  /**
   * The status of the card.
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   * The owner of this card.
   */
  @Expose
  @SerializedName("label_user")
  private LabelUser labelUser;

  /**
   */
  public static LabelCard fromJsonReader(JsonReader reader) {
    return fromJsonReader(LabelCard.class, reader);
  }

  /**
   * The public UUID.
   */
  public String getUuid() {
    return this.uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  /**
   * The type of the card.
   */
  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

  /**
   * The second line on the card.
   */
  public String getSecondLine() {
    return this.secondLine;
  }

  public void setSecondLine(String secondLine) {
    this.secondLine = secondLine;
  }

  /**
   * The date this card will expire.
   */
  public String getExpiryDate() {
    return this.expiryDate;
  }

  public void setExpiryDate(String expiryDate) {
    this.expiryDate = expiryDate;
  }

  /**
   * The status of the card.
   */
  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * The owner of this card.
   */
  public LabelUser getLabelUser() {
    return this.labelUser;
  }

  public void setLabelUser(LabelUser labelUser) {
    this.labelUser = labelUser;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.uuid != null) {
      return false;
    }

    if (this.type != null) {
      return false;
    }

    if (this.secondLine != null) {
      return false;
    }

    if (this.expiryDate != null) {
      return false;
    }

    if (this.status != null) {
      return false;
    }

    if (this.labelUser != null) {
      return false;
    }

    return true;
  }

}
