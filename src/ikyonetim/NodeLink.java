
package ikyonetim;

import java.io.Serializable;


public class NodeLink implements Serializable { 
    
     public  NodeLink next;
     public  Object Data;

    public NodeLink getNext() {
        return next;
    }

    public Object getData() {
        return Data;
    }

    public NodeLink(Object Data) {
        this.Data = Data;
    }
   
}
