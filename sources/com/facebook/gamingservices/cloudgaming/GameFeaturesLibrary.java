package com.facebook.gamingservices.cloudgaming;

import android.content.Context;
import com.facebook.gamingservices.cloudgaming.DaemonRequest;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKMessageEnum;
import org.json.JSONException;
import org.json.JSONObject;

public class GameFeaturesLibrary {
    public static void getPayload(Context context, JSONObject jSONObject, DaemonRequest.Callback callback) {
        DaemonRequest.executeAsync(context, jSONObject, callback, SDKMessageEnum.GET_PAYLOAD);
    }

    public static void canCreateShortcut(Context context, JSONObject jSONObject, DaemonRequest.Callback callback) {
        DaemonRequest.executeAsync(context, jSONObject, callback, SDKMessageEnum.CAN_CREATE_SHORTCUT);
    }

    public static void createShortcut(Context context, JSONObject jSONObject, DaemonRequest.Callback callback) {
        DaemonRequest.executeAsync(context, jSONObject, callback, SDKMessageEnum.CREATE_SHORTCUT);
    }

    public static void postSessionScore(Context context, int i, DaemonRequest.Callback callback) throws JSONException {
        DaemonRequest.executeAsync(context, new JSONObject().put("score", i), callback, SDKMessageEnum.POST_SESSION_SCORE);
    }

    public static void postSessionScoreAsync(Context context, int i, DaemonRequest.Callback callback) throws JSONException {
        DaemonRequest.executeAsync(context, new JSONObject().put("score", i), callback, SDKMessageEnum.POST_SESSION_SCORE_ASYNC);
    }

    public static void getTournamentAsync(Context context, DaemonRequest.Callback callback) {
        DaemonRequest.executeAsync(context, (JSONObject) null, callback, SDKMessageEnum.GET_TOURNAMENT_ASYNC);
    }

    public static void createTournamentAsync(Context context, int i, String str, String str2, String str3, String str4, Integer num, JSONObject jSONObject, DaemonRequest.Callback callback) throws JSONException {
        DaemonRequest.executeAsync(context, new JSONObject().put(SDKConstants.PARAM_INITIAL_SCORE, i).put("title", str).put("image", str2).put(SDKConstants.PARAM_SORT_ORDER, str3).put(SDKConstants.PARAM_SCORE_FORMAT, str4).put(SDKConstants.PARAM_END_TIME, num).put("data", jSONObject), callback, SDKMessageEnum.TOURNAMENT_CREATE_ASYNC);
    }

    public static void shareTournamentAsync(Context context, Integer num, JSONObject jSONObject, DaemonRequest.Callback callback) throws JSONException {
        DaemonRequest.executeAsync(context, new JSONObject().put("score", num).put("data", jSONObject), callback, SDKMessageEnum.TOURNAMENT_SHARE_ASYNC);
    }

    public static void postTournamentScoreAsync(Context context, int i, DaemonRequest.Callback callback) throws JSONException {
        DaemonRequest.executeAsync(context, new JSONObject().put("score", i), callback, SDKMessageEnum.TOURNAMENT_POST_SCORE_ASYNC);
    }

    public static void performHapticFeedbackAsync(Context context, DaemonRequest.Callback callback) {
        DaemonRequest.executeAsync(context, (JSONObject) null, callback, SDKMessageEnum.PERFORM_HAPTIC_FEEDBACK_ASYNC);
    }
}
