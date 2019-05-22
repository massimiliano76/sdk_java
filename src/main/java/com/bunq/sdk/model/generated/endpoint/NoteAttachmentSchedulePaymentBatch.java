package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.generated.object.AttachmentMonetaryAccountPayment;
import com.bunq.sdk.model.generated.object.LabelUser;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Used to manage attachment notes.
 */
public class NoteAttachmentSchedulePaymentBatch extends BunqModel {

  /**
   * Field constants.
   */
  public static final String FIELD_DESCRIPTION = "description";
  public static final String FIELD_ATTACHMENT_ID = "attachment_id";
  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_CREATE = "user/%s/monetary-account/%s/schedule-payment-batch/%s/note-attachment";
  protected static final String ENDPOINT_URL_UPDATE = "user/%s/monetary-account/%s/schedule-payment-batch/%s/note-attachment/%s";
  protected static final String ENDPOINT_URL_DELETE = "user/%s/monetary-account/%s/schedule-payment-batch/%s/note-attachment/%s";
  protected static final String ENDPOINT_URL_LISTING = "user/%s/monetary-account/%s/schedule-payment-batch/%s/note-attachment";
  protected static final String ENDPOINT_URL_READ = "user/%s/monetary-account/%s/schedule-payment-batch/%s/note-attachment/%s";
  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "NoteAttachment";

  /**
   * The id of the note.
   */
  @Expose
  @SerializedName("id")
  private Integer id;

  /**
   * The timestamp of the note's creation.
   */
  @Expose
  @SerializedName("created")
  private String created;

  /**
   * The timestamp of the note's last update.
   */
  @Expose
  @SerializedName("updated")
  private String updated;

  /**
   * The label of the user who created this note.
   */
  @Expose
  @SerializedName("label_user_creator")
  private LabelUser labelUserCreator;

  /**
   * Optional description of the attachment.
   */
  @Expose
  @SerializedName("description")
  private String description;

  /**
   * The attachment attached to the note.
   */
  @Expose
  @SerializedName("attachment")
  private List<AttachmentMonetaryAccountPayment> attachment;

  /**
   * Optional description of the attachment.
   */
  @Expose
  @SerializedName("description_field_for_request")
  private String descriptionFieldForRequest;

  /**
   * The reference to the uploaded file to attach to this note.
   */
  @Expose
  @SerializedName("attachment_id_field_for_request")
  private Integer attachmentIdFieldForRequest;

  public NoteAttachmentSchedulePaymentBatch() {
    this(null, null);
  }

  public NoteAttachmentSchedulePaymentBatch(Integer attachmentId) {
    this(attachmentId, null);
  }

  public NoteAttachmentSchedulePaymentBatch(Integer attachmentId, String description) {
    this.descriptionFieldForRequest = description;
    this.attachmentIdFieldForRequest = attachmentId;
  }

  /**
   * @param attachmentId The reference to the uploaded file to attach to this note.
   * @param description  Optional description of the attachment.
   */
  public static BunqResponse<Integer> create(Integer schedulePaymentBatchId, Integer attachmentId, Integer monetaryAccountId, String description, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

    HashMap<String, Object> requestMap = new HashMap<>();
    requestMap.put(FIELD_DESCRIPTION, description);
    requestMap.put(FIELD_ATTACHMENT_ID, attachmentId);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), schedulePaymentBatchId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> create() {
    return create(null, null, null, null, null);
  }

  public static BunqResponse<Integer> create(Integer schedulePaymentBatchId) {
    return create(schedulePaymentBatchId, null, null, null, null);
  }

  public static BunqResponse<Integer> create(Integer schedulePaymentBatchId, Integer attachmentId) {
    return create(schedulePaymentBatchId, attachmentId, null, null, null);
  }

  public static BunqResponse<Integer> create(Integer schedulePaymentBatchId, Integer attachmentId, Integer monetaryAccountId) {
    return create(schedulePaymentBatchId, attachmentId, monetaryAccountId, null, null);
  }

  public static BunqResponse<Integer> create(Integer schedulePaymentBatchId, Integer attachmentId, Integer monetaryAccountId, String description) {
    return create(schedulePaymentBatchId, attachmentId, monetaryAccountId, description, null);
  }

  /**
   * @param description Optional description of the attachment.
   */
  public static BunqResponse<Integer> update(Integer schedulePaymentBatchId, Integer noteAttachmentSchedulePaymentBatchId, Integer monetaryAccountId, String description, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

    HashMap<String, Object> requestMap = new HashMap<>();
    requestMap.put(FIELD_DESCRIPTION, description);

    byte[] requestBytes = determineAllRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.put(String.format(ENDPOINT_URL_UPDATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), schedulePaymentBatchId, noteAttachmentSchedulePaymentBatchId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> update(Integer schedulePaymentBatchId) {
    return update(schedulePaymentBatchId, null, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer schedulePaymentBatchId, Integer noteAttachmentSchedulePaymentBatchId) {
    return update(schedulePaymentBatchId, noteAttachmentSchedulePaymentBatchId, null, null, null);
  }

  public static BunqResponse<Integer> update(Integer schedulePaymentBatchId, Integer noteAttachmentSchedulePaymentBatchId, Integer monetaryAccountId) {
    return update(schedulePaymentBatchId, noteAttachmentSchedulePaymentBatchId, monetaryAccountId, null, null);
  }

  public static BunqResponse<Integer> update(Integer schedulePaymentBatchId, Integer noteAttachmentSchedulePaymentBatchId, Integer monetaryAccountId, String description) {
    return update(schedulePaymentBatchId, noteAttachmentSchedulePaymentBatchId, monetaryAccountId, description, null);
  }

  /**
   */
  public static BunqResponse<NoteAttachmentSchedulePaymentBatch> delete(Integer schedulePaymentBatchId, Integer noteAttachmentSchedulePaymentBatchId, Integer monetaryAccountId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.delete(String.format(ENDPOINT_URL_DELETE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), schedulePaymentBatchId, noteAttachmentSchedulePaymentBatchId), customHeaders);

    return new BunqResponse<>(null, responseRaw.getHeaders());
  }

  public static BunqResponse<NoteAttachmentSchedulePaymentBatch> delete(Integer schedulePaymentBatchId) {
    return delete(schedulePaymentBatchId, null, null, null);
  }

  public static BunqResponse<NoteAttachmentSchedulePaymentBatch> delete(Integer schedulePaymentBatchId, Integer noteAttachmentSchedulePaymentBatchId) {
    return delete(schedulePaymentBatchId, noteAttachmentSchedulePaymentBatchId, null, null);
  }

  public static BunqResponse<NoteAttachmentSchedulePaymentBatch> delete(Integer schedulePaymentBatchId, Integer noteAttachmentSchedulePaymentBatchId, Integer monetaryAccountId) {
    return delete(schedulePaymentBatchId, noteAttachmentSchedulePaymentBatchId, monetaryAccountId, null);
  }

  /**
   * Manage the notes for a given user.
   */
  public static BunqResponse<List<NoteAttachmentSchedulePaymentBatch>> list(Integer schedulePaymentBatchId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId(), determineMonetaryAccountId(monetaryAccountId), schedulePaymentBatchId), params, customHeaders);

    return fromJsonList(NoteAttachmentSchedulePaymentBatch.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<NoteAttachmentSchedulePaymentBatch>> list() {
    return list(null, null, null, null);
  }

  public static BunqResponse<List<NoteAttachmentSchedulePaymentBatch>> list(Integer schedulePaymentBatchId) {
    return list(schedulePaymentBatchId, null, null, null);
  }

  public static BunqResponse<List<NoteAttachmentSchedulePaymentBatch>> list(Integer schedulePaymentBatchId, Integer monetaryAccountId) {
    return list(schedulePaymentBatchId, monetaryAccountId, null, null);
  }

  public static BunqResponse<List<NoteAttachmentSchedulePaymentBatch>> list(Integer schedulePaymentBatchId, Integer monetaryAccountId, Map<String, String> params) {
    return list(schedulePaymentBatchId, monetaryAccountId, params, null);
  }

  /**
   */
  public static BunqResponse<NoteAttachmentSchedulePaymentBatch> get(Integer schedulePaymentBatchId, Integer noteAttachmentSchedulePaymentBatchId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), determineMonetaryAccountId(monetaryAccountId), schedulePaymentBatchId, noteAttachmentSchedulePaymentBatchId), params, customHeaders);

    return fromJson(NoteAttachmentSchedulePaymentBatch.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<NoteAttachmentSchedulePaymentBatch> get() {
    return get(null, null, null, null, null);
  }

  public static BunqResponse<NoteAttachmentSchedulePaymentBatch> get(Integer schedulePaymentBatchId) {
    return get(schedulePaymentBatchId, null, null, null, null);
  }

  public static BunqResponse<NoteAttachmentSchedulePaymentBatch> get(Integer schedulePaymentBatchId, Integer noteAttachmentSchedulePaymentBatchId) {
    return get(schedulePaymentBatchId, noteAttachmentSchedulePaymentBatchId, null, null, null);
  }

  public static BunqResponse<NoteAttachmentSchedulePaymentBatch> get(Integer schedulePaymentBatchId, Integer noteAttachmentSchedulePaymentBatchId, Integer monetaryAccountId) {
    return get(schedulePaymentBatchId, noteAttachmentSchedulePaymentBatchId, monetaryAccountId, null, null);
  }

  public static BunqResponse<NoteAttachmentSchedulePaymentBatch> get(Integer schedulePaymentBatchId, Integer noteAttachmentSchedulePaymentBatchId, Integer monetaryAccountId, Map<String, String> params) {
    return get(schedulePaymentBatchId, noteAttachmentSchedulePaymentBatchId, monetaryAccountId, params, null);
  }

  /**
   */
  public static NoteAttachmentSchedulePaymentBatch fromJsonReader(JsonReader reader) {
    return fromJsonReader(NoteAttachmentSchedulePaymentBatch.class, reader);
  }

  /**
   * The id of the note.
   */
  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The timestamp of the note's creation.
   */
  public String getCreated() {
    return this.created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  /**
   * The timestamp of the note's last update.
   */
  public String getUpdated() {
    return this.updated;
  }

  public void setUpdated(String updated) {
    this.updated = updated;
  }

  /**
   * The label of the user who created this note.
   */
  public LabelUser getLabelUserCreator() {
    return this.labelUserCreator;
  }

  public void setLabelUserCreator(LabelUser labelUserCreator) {
    this.labelUserCreator = labelUserCreator;
  }

  /**
   * Optional description of the attachment.
   */
  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * The attachment attached to the note.
   */
  public List<AttachmentMonetaryAccountPayment> getAttachment() {
    return this.attachment;
  }

  public void setAttachment(List<AttachmentMonetaryAccountPayment> attachment) {
    this.attachment = attachment;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.id != null) {
      return false;
    }

    if (this.created != null) {
      return false;
    }

    if (this.updated != null) {
      return false;
    }

    if (this.labelUserCreator != null) {
      return false;
    }

    if (this.description != null) {
      return false;
    }

    if (this.attachment != null) {
      return false;
    }

    return true;
  }

}
