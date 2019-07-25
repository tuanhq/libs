package org.thq.kafka;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String topic = "Hello-Kafka";
    	boolean isAsync = false;
        SampleProducer producerThread = new SampleProducer(topic, isAsync);
        // start the producer
        producerThread.start();
        
        SampleConsumer consumerThread = new SampleConsumer(topic);
        consumerThread.start();
    }
}
