import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Properties;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;

public class UnixConnect {


	// TODO Auto-generated method stub
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String host="seraebsdevapp01.opc.oracleoutsourcing.com";
		String user="c_rpatha";
		String password="GooglE@@122020";
		String command1="stat /interface/j_sera01/DSERAI/Ejaz/Rishi/Abc.txt | grep 'Change'";
		String command2 = "pbrun custdba -u oracle";
		String command3 = "find   /interface/j_sera01/DSERAI/Ejaz/ -atime -3 -type f -ls";

		ArrayList<String> commandList=new ArrayList<String>();//Creating arraylist    
		/*      commandList.add("pbrun custdba -u oracle");//Adding object in arraylist    */
		commandList.add(command2);
		commandList.add("find   /interface/j_sera01/DSERAI/Ejaz/Rishi/ -atime -1 -type f -print"); 

		commandList.add("find   /interface/j_sera01/DSERAI/Ejaz/ -atime -30 -type f -print");
		commandList.add(" find /interface/j_sera01/DSERAI/INTERFACE/TRANSF/PROVIDE/OUT/ARC -atime -200 -type f -print");
		String out =null;
		try{

			java.util.Properties config = new java.util.Properties(); 
			config.put("StrictHostKeyChecking", "no");
			JSch jsch = new JSch();
			Session session=jsch.getSession(user, host, 22);
			session.setPassword(password);
			session.setConfig(config);
			session.connect();
			System.out.println("Connected");
			Iterator<String>  itr = commandList.iterator(); 
			while (itr.hasNext()) {

				System.out.println("Outer while");
				out =null;
				Channel channel=session.openChannel("exec");

				//((ChannelExec)channel).setCommand(command1);

				((ChannelExec)channel).setCommand(itr.next());
				channel.setInputStream(null);
				((ChannelExec)channel).setErrStream(System.err);

				InputStream in=channel.getInputStream();
				channel.connect();
				byte[] tmp=new byte[1024];

				while(true){
					while(in.available()>0){
						int i=in.read(tmp, 0, 1024);
						System.out.println("i="+i);
						if(i<0)break;
						out = new String (tmp,0,i);
						System.out.print(new String(tmp, 0, i));
						
					}
					
					if(channel.isClosed()){
						System.out.println("exit-status: "+channel.getExitStatus());
						break;
					}
					//if (out.contains("su"))break;
					try{Thread.sleep(1000);
					
				//	System.out.println("Here " + out);
					}catch(Exception ee){}
					if (out != null && out.contains("su")) break;
				}

				channel.disconnect();
			}
			session.disconnect();
			System.out.println("DONE: "+ out.subSequence(8, 18));
		}catch(Exception e){
			e.printStackTrace();
		}


	}

}