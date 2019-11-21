import org.bson.Document;
import org.eclipse.jetty.server.session.Session;

public class PlayerDto {
    public Session client;
    public Document clientData;

    public PlayerDto(Session client, Document data){
        this.client = client;
        this.clientData = data;
    }


}