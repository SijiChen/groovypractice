/**
 * Created by sjchen on 11/6/16.
 */
class MapExample {
    static void main(String[] args) {
        def mp = ["TopicName" : "Maps", "TopicDescription" : "Methods in Maps"]
        println(mp.containsKey("TopicName"));
        println(mp.containsKey("Topic"));
//        The value of key-value pair or NULL if it does not exist.
        println(mp.get("TopicName"));
        println(mp.get("Topic"));

        println(mp.keySet());
        println(mp.size());
        mp.put("TopicID","1");
        println(mp);
        println(mp.values());
    }
}
