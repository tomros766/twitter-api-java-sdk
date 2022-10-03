/*
Copyright 2020 Twitter, Inc.
SPDX-License-Identifier: Apache-2.0

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
https://openapi-generator.tech
Do not edit the class manually.
*/


package com.twitter.clientlib.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.twitter.clientlib.model.TweetEditComplianceObjectSchemaTweet;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.twitter.clientlib.JSON;

/**
 * TweetEditComplianceObjectSchema
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TweetEditComplianceObjectSchema {
  public static final String SERIALIZED_NAME_EDIT_TWEET_IDS = "edit_tweet_ids";
  @SerializedName(SERIALIZED_NAME_EDIT_TWEET_IDS)
  private List<String> editTweetIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_EVENT_AT = "event_at";
  @SerializedName(SERIALIZED_NAME_EVENT_AT)
  private OffsetDateTime eventAt;

  public static final String SERIALIZED_NAME_INITIAL_TWEET_ID = "initial_tweet_id";
  @SerializedName(SERIALIZED_NAME_INITIAL_TWEET_ID)
  private String initialTweetId;

  public static final String SERIALIZED_NAME_TWEET = "tweet";
  @SerializedName(SERIALIZED_NAME_TWEET)
  private TweetEditComplianceObjectSchemaTweet tweet;

  public TweetEditComplianceObjectSchema() { 
  }

  public TweetEditComplianceObjectSchema editTweetIds(List<String> editTweetIds) {
    
    this.editTweetIds = editTweetIds;
    return this;
  }

  public TweetEditComplianceObjectSchema addEditTweetIdsItem(String editTweetIdsItem) {
    this.editTweetIds.add(editTweetIdsItem);
    return this;
  }

   /**
   * Get editTweetIds
   * @return editTweetIds
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<String> getEditTweetIds() {
    return editTweetIds;
  }


  public void setEditTweetIds(List<String> editTweetIds) {
    this.editTweetIds = editTweetIds;
  }


  public TweetEditComplianceObjectSchema eventAt(OffsetDateTime eventAt) {
    
    this.eventAt = eventAt;
    return this;
  }

   /**
   * Event time.
   * @return eventAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2021-07-06T18:40:40Z", required = true, value = "Event time.")

  public OffsetDateTime getEventAt() {
    return eventAt;
  }


  public void setEventAt(OffsetDateTime eventAt) {
    this.eventAt = eventAt;
  }


  public TweetEditComplianceObjectSchema initialTweetId(String initialTweetId) {
    
    this.initialTweetId = initialTweetId;
    return this;
  }

   /**
   * Unique identifier of this Tweet. This is returned as a string in order to avoid complications with languages and tools that cannot handle large integers.
   * @return initialTweetId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1346889436626259968", required = true, value = "Unique identifier of this Tweet. This is returned as a string in order to avoid complications with languages and tools that cannot handle large integers.")

  public String getInitialTweetId() {
    return initialTweetId;
  }


  public void setInitialTweetId(String initialTweetId) {
    this.initialTweetId = initialTweetId;
  }


  public TweetEditComplianceObjectSchema tweet(TweetEditComplianceObjectSchemaTweet tweet) {
    
    this.tweet = tweet;
    return this;
  }

   /**
   * Get tweet
   * @return tweet
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public TweetEditComplianceObjectSchemaTweet getTweet() {
    return tweet;
  }


  public void setTweet(TweetEditComplianceObjectSchemaTweet tweet) {
    this.tweet = tweet;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TweetEditComplianceObjectSchema tweetEditComplianceObjectSchema = (TweetEditComplianceObjectSchema) o;
    return Objects.equals(this.editTweetIds, tweetEditComplianceObjectSchema.editTweetIds) &&
        Objects.equals(this.eventAt, tweetEditComplianceObjectSchema.eventAt) &&
        Objects.equals(this.initialTweetId, tweetEditComplianceObjectSchema.initialTweetId) &&
        Objects.equals(this.tweet, tweetEditComplianceObjectSchema.tweet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(editTweetIds, eventAt, initialTweetId, tweet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TweetEditComplianceObjectSchema {\n");
    sb.append("    editTweetIds: ").append(toIndentedString(editTweetIds)).append("\n");
    sb.append("    eventAt: ").append(toIndentedString(eventAt)).append("\n");
    sb.append("    initialTweetId: ").append(toIndentedString(initialTweetId)).append("\n");
    sb.append("    tweet: ").append(toIndentedString(tweet)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("edit_tweet_ids");
    openapiFields.add("event_at");
    openapiFields.add("initial_tweet_id");
    openapiFields.add("tweet");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("edit_tweet_ids");
    openapiRequiredFields.add("event_at");
    openapiRequiredFields.add("initial_tweet_id");
    openapiRequiredFields.add("tweet");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TweetEditComplianceObjectSchema
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
     // if (jsonObj == null) {
     //   if (TweetEditComplianceObjectSchema.openapiRequiredFields.isEmpty()) {
     //     return;
     //   } else { // has required fields
     //     throw new IllegalArgumentException(String.format("The required field(s) %s in TweetEditComplianceObjectSchema is not found in the empty JSON string", TweetEditComplianceObjectSchema.openapiRequiredFields.toString()));
     //   }
     // }


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TweetEditComplianceObjectSchema.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (jsonObj.get("edit_tweet_ids") != null && !jsonObj.get("edit_tweet_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `edit_tweet_ids` to be an array in the JSON string but got `%s`", jsonObj.get("edit_tweet_ids").toString()));
      }
      if (jsonObj.get("initial_tweet_id") != null && !jsonObj.get("initial_tweet_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `initial_tweet_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("initial_tweet_id").toString()));
      }
      // validate the optional field `tweet`
      if (jsonObj.getAsJsonObject("tweet") != null) {
        TweetEditComplianceObjectSchemaTweet.validateJsonObject(jsonObj.getAsJsonObject("tweet"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TweetEditComplianceObjectSchema.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TweetEditComplianceObjectSchema' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TweetEditComplianceObjectSchema> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TweetEditComplianceObjectSchema.class));

       return (TypeAdapter<T>) new TypeAdapter<TweetEditComplianceObjectSchema>() {
           @Override
           public void write(JsonWriter out, TweetEditComplianceObjectSchema value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TweetEditComplianceObjectSchema read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TweetEditComplianceObjectSchema given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TweetEditComplianceObjectSchema
  * @throws IOException if the JSON string is invalid with respect to TweetEditComplianceObjectSchema
  */
  public static TweetEditComplianceObjectSchema fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TweetEditComplianceObjectSchema.class);
  }

 /**
  * Convert an instance of TweetEditComplianceObjectSchema to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
