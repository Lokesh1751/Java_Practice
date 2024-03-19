public class Codec {

    HashMap<String,String> hm=new HashMap<>();
    int n=0;
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        String res="http://tinyurl.com/"+n;
        n++;
        hm.put(res,longUrl);
        return res;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return hm.get(shortUrl);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));
//LEETCODE
