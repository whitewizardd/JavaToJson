package tryingJson;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Company {
    private String name;
    private String catchPhrase;
    @JsonProperty("bs")
    private String businessService;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCatchPhrase() {
        return catchPhrase;
    }

    public void setCatchPhrase(String catchPhrase) {
        this.catchPhrase = catchPhrase;
    }

    public String getBusinessService() {
        return businessService;
    }

    public void setBusinessService(String businessService) {
        this.businessService = businessService;
    }
}
