package fastJsonAndJsonField;

import com.alibaba.fastjson.JSONObject;

import java.util.Objects;

public class AliJsonConvert
{
    public static void main(String[] args)
    {
        String jsonString = "{\n"
                + "    \"success\": true,\n"
                + "    \"code\": \"200\",\n"
                + "    \"message\": null,\n"
                + "    \"requestId\": \"D310F166-7A29-47B7-B429-E98D5A16DDC9\",\n"
                + "    \"data\": {\n"
                + "        \"access_token\": \"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdWQiOlsiZW50ZXJwcmlzZV9tb2JpbGVfcmVzb3VyY2UiLCJiZmZfYXBpX3Jlc291cmNlIl0sImV4cCI6MTYwOTQzOTE5MiwidXNlcl9uYW1lIjoiemhhbmdkaCIsImp0aSI6IjE1ZjdhNGUxLTRiYTgtNGQyNC05YjNjLWFjZDllMTIzNGU1OCIsImNsaWVudF9pZCI6IjRlOGRmZGQ3NjZhNzVlMWEwM2FlMWZhZTlhM2VkNWU3Nlk3dnNtTFZnR0EiLCJzY29wZSI6WyJyZWFkIl19.XwgduGSlQoQHrKQbcjuO3gPGtl-zpS7GEWmS9lycOVY\",\n"
                + "        \"refresh_token\": \"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdWQiOlsiZW50ZXJwcmlzZV9tb2JpbGVfcmVzb3VyY2UiLCJiZmZfYXBpX3Jlc291cmNlIl0sInVzZXJfbmFtZSI6InpoYW5nZGgiLCJzY29wZSI6WyJyZWFkIl0sImF0aSI6IjE1ZjdhNGUxLTRiYTgtNGQyNC05YjNjLWFjZDllMTIzNGU1OCIsImV4cCI6MTYxMTk4Nzk5MiwianRpIjoiMjZkYTI0MDQtYTZlYi00NWE3LWIwYzQtZmU4NzZhNzNkYmIxIiwiY2xpZW50X2lkIjoiNGU4ZGZkZDc2NmE3NWUxYTAzYWUxZmFlOWEzZWQ1ZTc2WTd2c21MVmdHQSJ9.GF-fFHaG_n7LNcwkyJtXQYrho7sLwkfJjGXsTArXPf4\",\n"
                + "        \"expires_in\": 42696,\n"
                + "        \"app_token\": \"eyJhbGciOiJSUzI1NiIsImtpZCI6IjU1MTQ2NTU5NTQ3NjE0Mzc2NjAifQ.eyJlbWFpbCI6InpoYW5nZGhAemhhbmdkaC5jb20iLCJuYW1lIjoiemhhbmdkaCIsIm1vYmlsZSI6IjEzODgxODE3NDMzIiwiZXh0ZXJuYWxJZCI6IjI0ODc0OTc3NTMyODExMjc4MjgiLCJ1ZEFjY291bnRVdWlkIjoiOGJjNjIxOTdjNTUwYjA3M2IyMGRlZDNhOWNiYWYwYTNpZ1UxSkFQdkpLWSIsIm91SWQiOiI2MDM4MTczNTY2NDcxNTI2OTQiLCJvdU5hbWUiOiJ6aGFuZ2RoIiwib3BlbklkIjpudWxsLCJpZHBVc2VybmFtZSI6InpoYW5nZGgiLCJ1c2VybmFtZSI6InpoYW5nZGgiLCJhcHBsaWNhdGlvbk5hbWUiOiJKV1RfbmFtZSIsImVudGVycHJpc2VJZCI6InpoYW5nZGgiLCJpbnN0YW5jZUlkIjoiemhhbmdkaCIsImFsaXl1bkRvbWFpbiI6IiIsImV4dGVuZEZpZWxkcyI6eyJ0aGVtZUNvbG9yIjoiZ3JlZW4iLCJhcHBOYW1lIjoiSldUX25hbWUifSwiZXhwIjoxNjEwMjgyNzA1LCJqdGkiOiJlWW5rY2ZORDhBSnB2YW1FRGFscnRRIiwiaWF0IjoxNjEwMjgyMTA1LCJuYmYiOjE2MTAyODIwNDUsInN1YiI6InpoYW5nZGgiLCJpc3MiOiJodHRwczovL3poYW5nZGguaWRwNC5pZHNtYW5hZ2VyLmNvbS8iLCJhdWQiOiJ6aGFuZ2RocGx1Z2luX2p3dDEifQ.q9UpW9woB3nXYIVm4ZOVIktiQpXzrhebK7-ozh7FEfXOYn9-zsb_oi8IDBPhvO3zJDaV622Vo8qgr6yFAHrpVvPgswe7vq_JaVeFoLBDQcWXXd6L-ZwwpK9_8SfzzCKs3yomJIw2uqf56KS5spLdQDD6PglIRv7P1fwL0XgBMddaL7VPh2P5Wb5Ccqwl76pyJVvkuJRuqf0N_rpX_DcWLjdSBqB-I37R-zWXcNpXQ1atVUJ5GovYoIKklreHK-YlblMRJ8mzISM9td2R3gIbyz7KvYfu9rvUOCImwLefZemD0BRmPc9OyyfnvsUDvLkEBJAFgZ2mVdckG4Xv7gd34Q\",\n"
                + "        \"device_id\": null\n"
                + "    }\n"
                + "}";

        JSONObject jsonObject = JSONObject.parseObject(jsonString);
        if(Objects.equals(jsonObject.toString(),jsonObject.toJSONString())){
            System.out.println("111111111111111111111111111");
        }


        String data = jsonObject.getString("data");

        JSONObject jsonObjectData = JSONObject.parseObject(data);

        String  token  = jsonObjectData.getString("access_token");
        System.out.println(token);
    }
}
