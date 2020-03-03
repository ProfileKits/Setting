package com.lavamusic;

public class Common {
    private static Common common;
    private static final Object LockThis = new Object();
    public synchronized static Common object() {
        synchronized (LockThis) {
            if (null == common) {
                common = new Common();
            }
        }
        return common;
    }
    public int getTime(){
        return 0;
    }
    public String getName(){
        return "com.lavamusic.midi.MusicService";
    }
    public static final String getLavaMusicReleaseKey(){return "null";}
    public static final String getLavaMusicDebugKey(){ return "krzd8Uj5p8rviZ1Xjxm7YcrBW2vYRs2cRbspWiQY2IM=";}

}
