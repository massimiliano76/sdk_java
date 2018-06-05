package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Create a payment batch, or show the payment batches of a monetary account.
 */
public class PaymentBatch extends BunqModel {

  /**
   * Endpoint constants.
   */
  protected static final String ENDPOINT_URL_CREATE = "user/%s/monetary-account/%s/payment-batch";
  protected static final String ENDPOINT_URL_UPDATE = "user/%s/monetary-account/%s/payment-batch/%s";
  protected static final String ENDPOINT_URL_READ = "user/%s/monetary-account/%s/payment-batch/%s";
  protected static final String ENDPOINT_URL_LISTING = "user/%s/monetary-account/%s/payment-batch";

  /**
   * Field constants.
   */
  public static final String FIELD_PAYMENTS = "payments";

  /**
   * Object type.
   */
  protected static final String OBJECT_TYPE_GET = "PaymentBatch";

  /**
   * The list of mutations that were made.
   */
  @Expose
  @SerializedName("payments")
  private List<Payment> payments;

  /**
   * The list of payments we want to send in a single batch.
   */
  @Expose
  @SerializedName("payments_field_for_request")
  private List<Payment> paymentsFieldForRequest;

  public PaymentBatch() {
    this(null);
  }

  public PaymentBatch(List<Payment> payments) {
    this.paymentsFieldForRequest = payments;
  }

  /**
   * Create a payment batch by sending an array of single payment objects, that will become part
   * of the batch.
   * @param payments The list of payments we want to send in a single batch.
   */
  public static BunqResponse<Integer> create(List<Payment> payments, Integer monetaryAccountId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

    HashMap<String, Object> requestMap = new HashMap<>();
    requestMap.put(FIELD_PAYMENTS, payments);

    byte[] requestBytes = determineRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.post(String.format(ENDPOINT_URL_CREATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId)), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> create() {
    return create(null, null, null);
  }

  public static BunqResponse<Integer> create(List<Payment> payments) {
    return create(payments, null, null);
  }

  public static BunqResponse<Integer> create(List<Payment> payments, Integer monetaryAccountId) {
    return create(payments, monetaryAccountId, null);
  }

  /**
   * Revoke a bunq.to payment batch. The status of all the payments will be set to REVOKED.
   */
  public static BunqResponse<Integer> update(Integer paymentBatchId, Integer monetaryAccountId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());

    if (customHeaders == null) {
      customHeaders = new HashMap<>();
    }

    HashMap<String, Object> requestMap = new HashMap<>();

    byte[] requestBytes = determineRequestByte(requestMap);
    BunqResponseRaw responseRaw = apiClient.put(String.format(ENDPOINT_URL_UPDATE, determineUserId(), determineMonetaryAccountId(monetaryAccountId), paymentBatchId), requestBytes, customHeaders);

    return processForId(responseRaw);
  }

  public static BunqResponse<Integer> update(Integer paymentBatchId) {
    return update(paymentBatchId, null, null);
  }

  public static BunqResponse<Integer> update(Integer paymentBatchId, Integer monetaryAccountId) {
    return update(paymentBatchId, monetaryAccountId, null);
  }

  /**
   * Return the details of a specific payment batch.
   */
  public static BunqResponse<PaymentBatch> get(Integer paymentBatchId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, determineUserId(), determineMonetaryAccountId(monetaryAccountId), paymentBatchId), params, customHeaders);

    return fromJson(PaymentBatch.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<PaymentBatch> get() {
    return get(null, null, null, null);
  }

  public static BunqResponse<PaymentBatch> get(Integer paymentBatchId) {
    return get(paymentBatchId, null, null, null);
  }

  public static BunqResponse<PaymentBatch> get(Integer paymentBatchId, Integer monetaryAccountId) {
    return get(paymentBatchId, monetaryAccountId, null, null);
  }

  public static BunqResponse<PaymentBatch> get(Integer paymentBatchId, Integer monetaryAccountId, Map<String, String> params) {
    return get(paymentBatchId, monetaryAccountId, params, null);
  }

  /**
   * Return all the payment batches for a monetary account.
   */
  public static BunqResponse<List<PaymentBatch>> list(Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(getApiContext());
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId(), determineMonetaryAccountId(monetaryAccountId)), params, customHeaders);

    return fromJsonList(PaymentBatch.class, responseRaw, OBJECT_TYPE_GET);
  }

  public static BunqResponse<List<PaymentBatch>> list() {
    return list(null, null, null);
  }

  public static BunqResponse<List<PaymentBatch>> list(Integer monetaryAccountId) {
    return list(monetaryAccountId, null, null);
  }

  public static BunqResponse<List<PaymentBatch>> list(Integer monetaryAccountId, Map<String, String> params) {
    return list(monetaryAccountId, params, null);
  }

  /**
   * The list of mutations that were made.
   */
  public List<Payment> getPayments() {
    return this.payments;
  }

  public void setPayments(List<Payment> payments) {
    this.payments = payments;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.payments != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static PaymentBatch fromJsonReader(JsonReader reader) {
    return fromJsonReader(PaymentBatch.class, reader);
  }

}
