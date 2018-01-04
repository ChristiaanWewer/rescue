package com.dev.chris.cryptonite;

import android.util.Log;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by chris on 3-1-2018.
 */

public class helpers extends CryptoFragment {

//    JSONArray jsonArray;

//    // volley to get stuff
//    public void getJsonByVolley(String url) {
//        RequestQueue queue = Volley.newRequestQueue(this.getContext());
//
//        // Request a string response from the provided URL.
//        final JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET,
//                url, null,
//                new Response.Listener<JSONObject>() {
//                    @Override
//                    public void onResponse(JSONObject response) {
//
//                        String fullnameString;
//                        String idString;
//
//                        // save variables in database
//                        try {
//                            jsonArray = response.getJSONArray("Data");
//                            for (int i = 0, n =jsonArray.length(); i < n; i++) {
//
//                                fullnameString = jsonArray.getJSONObject(i).getString("Fullname");
//                                idString = jsonArray.getJSONObject(i).getString("Id");
//
//                                db.addCoinNameIdItem(Integer.parseInt(idString), fullnameString);
//                            }
//                        }
//                        catch (JSONException e) {
//                            Log.d("JSONException", e.toString());
//                        }
//
//                    }
//                }, new Response.ErrorListener() {
//            @Override
//            public void onErrorResponse(VolleyError error) {
//                Log.d("That didn't work!","that really didn't work");
//            }
//        });
//        // Add the request to the RequestQueue.
//        queue.add(jsonObjectRequest);
//    }
}
