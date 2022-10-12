package com.sysco.qe.subs.environment;

public enum SubsEnv {
    QA("https://dds-internal-qa.prcp-rm-np.us-east-1.aws.sysco.net", "https://dds-qa-auth.prcp-rm-np.us-east-1.aws.sysco.net"),
    DEV("https://dds-internal-dev.prcp-rm-np.us-east-1.aws.sysco.net", "https://dds-dev-auth.prcp-rm-np.us-east-1.aws.sysco.net");

    private String url;
    private String awsUrl;

    SubsEnv(String url, String awsUrl) {
        this.url = url;
        this.awsUrl = awsUrl;

    }

    public String getUrl() {
        return url;
    }

    public String getAwsurl() {
        return awsUrl;
    }

}
