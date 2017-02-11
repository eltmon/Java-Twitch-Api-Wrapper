
package com.mb3364.twitch.api.models;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "_id",
    "name",
    "info",
    "display_name",
    "created_at",
    "updated_at",
    "logo",
    "banner",
    "background"
})
public class Team {

    @JsonProperty("_id")
    private Integer id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("info")
    private String info;
    @JsonProperty("display_name")
    private String displayName;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("updated_at")
    private String updatedAt;
    @JsonProperty("logo")
    private String logo;
    @JsonProperty("banner")
    private Object banner;
    @JsonProperty("background")
    private String background;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Team() {
    }

    /**
     * 
     * @param updatedAt
     * @param id
     * @param logo
     * @param createdAt
     * @param background
     * @param name
     * @param displayName
     * @param banner
     * @param info
     */
    public Team(Integer id, String name, String info, String displayName, String createdAt, String updatedAt, String logo, Object banner, String background) {
        super();
        this.id = id;
        this.name = name;
        this.info = info;
        this.displayName = displayName;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.logo = logo;
        this.banner = banner;
        this.background = background;
    }

    @JsonProperty("_id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("_id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("info")
    public String getInfo() {
        return info;
    }

    @JsonProperty("info")
    public void setInfo(String info) {
        this.info = info;
    }

    @JsonProperty("display_name")
    public String getDisplayName() {
        return displayName;
    }

    @JsonProperty("display_name")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("updated_at")
    public String getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty("updated_at")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @JsonProperty("logo")
    public String getLogo() {
        return logo;
    }

    @JsonProperty("logo")
    public void setLogo(String logo) {
        this.logo = logo;
    }

    @JsonProperty("banner")
    public Object getBanner() {
        return banner;
    }

    @JsonProperty("banner")
    public void setBanner(Object banner) {
        this.banner = banner;
    }

    @JsonProperty("background")
    public String getBackground() {
        return background;
    }

    @JsonProperty("background")
    public void setBackground(String background) {
        this.background = background;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
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
    public int hashCode() {
        return new HashCodeBuilder().append(id).append(name).append(info).append(displayName).append(createdAt).append(updatedAt).append(logo).append(banner).append(background).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Team)) {
            return false;
        }
        Team rhs = ((Team) other);
        return new EqualsBuilder().append(id, rhs.id).append(name, rhs.name).append(info, rhs.info).append(displayName, rhs.displayName).append(createdAt, rhs.createdAt).append(updatedAt, rhs.updatedAt).append(logo, rhs.logo).append(banner, rhs.banner).append(background, rhs.background).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
