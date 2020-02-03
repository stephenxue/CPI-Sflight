import com.sap.gateway.ip.core.customdev.util.Message;
import java.util.HashMap;
def Message processData(Message message) {
  message.setHeader("Content-Type", "text/xml" + "; charset=utf-8" );
  message.setHeader("Accept", "text/xml" + "; charset=utf-8" );
  return message;
}