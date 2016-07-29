package vn.datsan.datsan.utils;

import java.util.List;

import vn.datsan.datsan.BuildConfig;

/**
 * Created by yennguyen on 10/06/2016.
 */
public class Constants {

    /**
     * Constants for Firebase URL
     */
    public static final String FIREBASE_URL = BuildConfig.UNIQUE_FIREBASE_ROOT_URL;

    /*
     * Firebase objects
     */
    public static final String FIREBASE_APP_ROOT = "app";
    public static final String FIREBASE_USERS = "users";
    public static final String FIREBASE_GROUPS = "groups";
    public static final String FIREBASE_FIELDS = "fields";

    /*
     * Indexed objects used for searching
     */
    public static final String[] ACCEPT_INDEX_TYPES = {FIREBASE_USERS, FIREBASE_FIELDS, FIREBASE_GROUPS, "user-posts", "posts"};

    /*
     * Elasticsearch server
     */
    // Elasticsearch URL
    public static final String ELASTICSEARCH_SERVER_URL = BuildConfig.ELASTICSEARCH_SERVER_URL;
    // Elasticsearch default credentials (api_key, api_value)
    public static final String ELASTICSEARCH_USERNAME = BuildConfig.ELASTICSEARCH_USERNAME;
    public static final String ELASTICSEARCH_PASSWORD = BuildConfig.ELASTICSEARCH_PASSWORD;
    public static final String ELASTICSEARCH_INDEX = "socialsport";

    public static final int GOOGLE_SIGN_IN_CODE = 9001;

}
