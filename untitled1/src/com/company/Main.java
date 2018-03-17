package com.company;


public class Main {


        {

            public static void initialize(JSONObject jsonObject, Object object) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            for(Field field : object.getClass().getDeclaredFields()) {
                String fieldSetter = "set" + field.getName().substring(0, 1).toUpperCase() + field.getName().substring(1);
                Class fieldClass = field.getType();
                Object fieldValue = null;

                try{
                    fieldValue = jsonObject.get(field.getName());
                } catch (JSONException ex) {}

                Method method = object.getClass().getDeclaredMethod(fieldSetter, fieldClass);
                method.invoke(object, fieldValue);
            }
        }
                }}
