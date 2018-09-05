import java.util.*;

class Channel {
    public Channel(String name) {
        this.name = name;
        this.subscribers = new ArrayList<>();
    }
    
    private String name;
    private List<Subscriber> subscribers;
    
    public void addSubscriber(Subscriber subscriber) {
        this.subscribers.add(subscriber);
    }
    
    public void addSubscribers(Subscriber... subscribers) {
        if(subscribers.length > 0)        
        this.subscribers.addAll(Arrays.asList(subscribers));
    }
}

class Publisher {
    void publishMessage(String topic, String message) {
        
    }
}

class Subscriber {
    String emailId;
    String name;
    
    public Subscriber(String name, String emailId) {
        
    }
}

class ChatClient {
    
    private Publisher publisher;
    
    public ChatClient(String emailId) {
        this.emailId = emailId;
        this.publisher = new Publisher();
    }
    
    public void sendMessage(String sendTo, String message) {
        sendFrom = this.emailId;
        String topic = getTopic(sendFrom, sendTo);
        publisher.publish(topic, message);
    }
    
}

public class MyClass {
    public static void main(String args[]) {
        ChatClient client = new ChatClient();
        client.sendMessage("B@gmail.com","hi");
        
        Publisher publisher = new Publisher();
        publisher.publish();
        Subscriber s1 = new Subscriber("A", "A@gmail.com");
        Subscriber s2 = new Subscriber("B", "B@gmail.com");
        Channel channel = new Channel("s1-s2");
        channel.addSubscribers(s1, s2);
    }
}
