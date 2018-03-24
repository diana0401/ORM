package standaloneClient;

import java.util.Date;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.apache.derby.tools.sysinfo;

import com.example.myfirstejb.dao.ClientB2BDAORemote;
import com.example.myfirstejb.dao.ClientB2CDAORemote;
import com.example.myfirstejb.dao.OrderTableDAORemote;
import com.example.myfirstejb.dto.ClientB2BDTO;
import com.example.myfirstejb.dto.ClientB2CDTO;
import com.example.myfirstejb.dto.OrderTableDTO;


public class TestInsertDB {

	public static void main(String[] args) throws NamingException{		
		OrderTableDTO orderTableDTO = new OrderTableDTO();
		orderTableDTO.setOrderTableId(1);
		orderTableDTO.setClientB2CId(4);
		orderTableDTO.setDate(new Date());
		orderTableDTO.setOrderNumber(3);
		
		System.out.println("DTO setted");
		InitialContext context = new InitialContext();
		System.out.println("context created");
		OrderTableDAORemote clientEJB = (OrderTableDAORemote) context.lookup("java:global/WineEARProject/WineEJBProject/OrderTableDAO!com.example.myfirstejb.dao.OrderTableDAORemote");
		System.out.println("clientEJB created");
		clientEJB.delete(orderTableDTO);
		System.out.println("done");
	}
}
