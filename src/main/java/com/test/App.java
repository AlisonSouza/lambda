package com.test;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.lambda.runtime.Context;

public class App
{
    public static Object handlerRequest(Request request, Context context)
            throws Exception
    {

        AmazonDynamoDB client = AmazonDynamoDBClientBuilder.defaultClient();
        DynamoDBMapper mapper = new DynamoDBMapper(client);
        Message message = null;

        switch (request.getHttpMethod())
        {
            case "GET":
                context.getLogger().log("Alisonnnnnnnnnnnnnnnnnn");
                if(request.getQueryByName() != null){

                    return null;
                }


                message = mapper.load(Message.class, request.getId());
                if (message == null)
                {
                    throw new Exception("resource not found");
                }
                return message;
            case "POST":
                message = request.getMessage();
                mapper.save(message);
                return message;
            default:
                break;
        }

        return null;
    }
}
