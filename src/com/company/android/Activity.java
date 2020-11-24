package com.company.android;

public class Activity {
    private Intent intent;

    public void onCreate(){
        System.out.println("setting up onCreate in Activity ");

    }
    public void setContentView(String layout){
        System.out.println("setting up " + layout);

    }

    public void startActivity(Intent intent){
        intent.activity.setIntent(intent);
        intent.activity.onCreate();
    }
    public Intent getIntent(){
        return intent;
    }
    public void setIntent(Intent intent){
        this.intent = intent;
    }
}
