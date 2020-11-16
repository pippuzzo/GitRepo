
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
    "id",
    "symbol",
    "partner_symbol",
    "data_available_from"
})
public class Snip {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("symbol")
    private String symbol;
    @JsonProperty("partner_symbol")
    private String partnerSymbol;
    @JsonProperty("data_available_from")
    private Integer dataAvailableFrom;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("symbol")
    public String getSymbol() {
        return symbol;
    }

    @JsonProperty("symbol")
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    @JsonProperty("partner_symbol")
    public String getPartnerSymbol() {
        return partnerSymbol;
    }

    @JsonProperty("partner_symbol")
    public void setPartnerSymbol(String partnerSymbol) {
        this.partnerSymbol = partnerSymbol;
    }

    @JsonProperty("data_available_from")
    public Integer getDataAvailableFrom() {
        return dataAvailableFrom;
    }

    @JsonProperty("data_available_from")
    public void setDataAvailableFrom(Integer dataAvailableFrom) {
        this.dataAvailableFrom = dataAvailableFrom;
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
        sb.append(Snip.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("symbol");
        sb.append('=');
        sb.append(((this.symbol == null)?"<null>":this.symbol));
        sb.append(',');
        sb.append("partnerSymbol");
        sb.append('=');
        sb.append(((this.partnerSymbol == null)?"<null>":this.partnerSymbol));
        sb.append(',');
        sb.append("dataAvailableFrom");
        sb.append('=');
        sb.append(((this.dataAvailableFrom == null)?"<null>":this.dataAvailableFrom));
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
        result = ((result* 31)+((this.symbol == null)? 0 :this.symbol.hashCode()));
        result = ((result* 31)+((this.dataAvailableFrom == null)? 0 :this.dataAvailableFrom.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.partnerSymbol == null)? 0 :this.partnerSymbol.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Snip) == false) {
            return false;
        }
        Snip rhs = ((Snip) other);
        return ((((((this.symbol == rhs.symbol)||((this.symbol!= null)&&this.symbol.equals(rhs.symbol)))&&((this.dataAvailableFrom == rhs.dataAvailableFrom)||((this.dataAvailableFrom!= null)&&this.dataAvailableFrom.equals(rhs.dataAvailableFrom))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.partnerSymbol == rhs.partnerSymbol)||((this.partnerSymbol!= null)&&this.partnerSymbol.equals(rhs.partnerSymbol))));
    }

}
