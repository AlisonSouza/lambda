package com.test;

public class Request
{
    private String httpMethod;

    private int id;

    private Message message;

    private String queryByName;

    public String getHttpMethod()
    {
        return httpMethod;
    }

    public void setHttpMethod(String httpMethod)
    {
        this.httpMethod = httpMethod;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public Message getMessage()
    {
        return message;
    }

    public void setMessage(Message message)
    {
        this.message = message;
    }

    public String getQueryByName()
    {
        return queryByName;
    }

    public void setQueryByName(String queryByName)
    {
        this.queryByName = queryByName;
    }
}