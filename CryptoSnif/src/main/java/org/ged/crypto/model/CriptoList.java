
package org.ged.crypto.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Response",
    "Message",
    "HasWarning",
    "Type",
    "RateLimit",
    "Data"
})
public class CriptoList {

    @JsonProperty("Response")
    private String response;
    @JsonProperty("Message")
    private String message;
    @JsonProperty("HasWarning")
    private Boolean hasWarning;
    @JsonProperty("Type")
    private Integer type;
    @JsonProperty("RateLimit")
    private RateLimit rateLimit;
    @JsonProperty("Data")
    private Data data;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Response")
    public String getResponse() {
        return response;
    }

    @JsonProperty("Response")
    public void setResponse(String response) {
        this.response = response;
    }

    @JsonProperty("Message")
    public String getMessage() {
        return message;
    }

    @JsonProperty("Message")
    public void setMessage(String message) {
        this.message = message;
    }

    @JsonProperty("HasWarning")
    public Boolean getHasWarning() {
        return hasWarning;
    }

    @JsonProperty("HasWarning")
    public void setHasWarning(Boolean hasWarning) {
        this.hasWarning = hasWarning;
    }

    @JsonProperty("Type")
    public Integer getType() {
        return type;
    }

    @JsonProperty("Type")
    public void setType(Integer type) {
        this.type = type;
    }

    @JsonProperty("RateLimit")
    public RateLimit getRateLimit() {
        return rateLimit;
    }

    @JsonProperty("RateLimit")
    public void setRateLimit(RateLimit rateLimit) {
        this.rateLimit = rateLimit;
    }

    @JsonProperty("Data")
    public Data getData() {
        return data;
    }

    @JsonProperty("Data")
    public void setData(Data data) {
        this.data = data;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CriptoList.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("response");
        sb.append('=');
        sb.append(((this.response == null)?"<null>":this.response));
        sb.append(',');
        sb.append("message");
        sb.append('=');
        sb.append(((this.message == null)?"<null>":this.message));
        sb.append(',');
        sb.append("hasWarning");
        sb.append('=');
        sb.append(((this.hasWarning == null)?"<null>":this.hasWarning));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("rateLimit");
        sb.append('=');
        sb.append(((this.rateLimit == null)?"<null>":this.rateLimit));
        sb.append(',');
        sb.append("data");
        sb.append('=');
        sb.append(((this.data == null)?"<null>":this.data));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.rateLimit == null)? 0 :this.rateLimit.hashCode()));
        result = ((result* 31)+((this.data == null)? 0 :this.data.hashCode()));
        result = ((result* 31)+((this.response == null)? 0 :this.response.hashCode()));
        result = ((result* 31)+((this.hasWarning == null)? 0 :this.hasWarning.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.message == null)? 0 :this.message.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CriptoList) == false) {
            return false;
        }
        CriptoList rhs = ((CriptoList) other);
        return ((((((((this.rateLimit == rhs.rateLimit)||((this.rateLimit!= null)&&this.rateLimit.equals(rhs.rateLimit)))&&((this.data == rhs.data)||((this.data!= null)&&this.data.equals(rhs.data))))&&((this.response == rhs.response)||((this.response!= null)&&this.response.equals(rhs.response))))&&((this.hasWarning == rhs.hasWarning)||((this.hasWarning!= null)&&this.hasWarning.equals(rhs.hasWarning))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.message == rhs.message)||((this.message!= null)&&this.message.equals(rhs.message))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))));
    }

}
