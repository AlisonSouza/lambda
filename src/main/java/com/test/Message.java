package com.test;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

public @DynamoDBTable(tableName = "Message")
class Message
{

    @DynamoDBHashKey
    private int id;

    @DynamoDBAttribute
    private String name;

    @DynamoDBAttribute
    private String type;

    public Message(int id, String name, String type)
    {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public Message()
    {
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }
}
