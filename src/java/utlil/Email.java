package util;

import java.util.Date;
import java.util.Iterator;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.activation.DataHandler;
import javax.activation.DataSource;

public class Email {
    //   Email:   tunvde170069@fpt.edu.vn
    //  pass:     vmismvumokjlgsir

    static final String from = "tunvde170069@fpt.edu.vn";
    static final String password = "vmismvumokjlgsir";

    public static boolean sendEmail(String to, String tieuDe, String noiDung) {
        // Properties : khai báo các thuộc tính
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com"); // SMTP HOST
        props.put("mail.smtp.port", "587"); // TLS 587 SSL 465
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");

        // create Authenticator
        Authenticator auth = new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                // TODO Auto-generated method stub
                return new PasswordAuthentication(from, password);
            }
        };

        // Phiên làm việc
        Session session = Session.getInstance(props, auth);

        // Tạo một tin nhắn
        MimeMessage msg = new MimeMessage(session);

        try {
            // Kiểu nội dung
            msg.addHeader("Content-type", "text/HTML; charset=UTF-8");

            // Người gửi
            msg.setFrom(from);

            // Người nhận
            msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to, false));

            // Tiêu đề email
            msg.setSubject("Xác Nhận Đăng Kí tài Khoản SearchHome.SH");

            // Quy đinh ngày gửi
            msg.setSentDate(new Date());

            // Quy định email nhận phản hồi
//			 msg.setReplyTo(InternetAddress.parse(from, false));
            // Nội dung
//			msg.setContent(noiDung, "text/HTML; charset=UTF-8");
            String htmlContent = "<!DOCTYPE html>\n"
                + "<html>\n"
                + "<head>\n"
                + "    <title>Xác Nhận Đăng Ký Tài Khoản</title>\n"
                + "</head>\n"
                + "<body>\n"
                + "    <div style=\"width: 80%; margin: 0 auto; padding: 20px;\">\n"
                + "        <h1>Bức Thư Đầu Tiên</h1>\n"
                + "        <p>Xin chào bạn,</p>\n"
                + "        <p>Tôi hy vọng bạn đang khỏe mạnh và vui vẻ. Tôi viết thư này để chia sẻ những điều mới nhất trong cuộc sống của tôi.</p>\n"
                + "        <p>Hôm nay, tôi đã có một ngày tuyệt vời. Tôi đã đi dạo trong công viên và thưởng thức bầu trời xanh đẹp. Sau đó, tôi đã gặp gỡ bạn bè và cùng họ ăn tối tại một nhà hàng ngon. Cuộc sống thật tốt đẹp!</p>\n"
                + "        <p>Chúc bạn một ngày vui vẻ và hãy giữ gìn sức khỏe.</p>\n"
                + "        <p>Trân trọng,</p>\n"
                + "        <p>Search Home</p>\n"
                + "    </div>\n"
                + "</body>\n"
                + "</html>";

// Sử dụng setText để đặt nội dung email dưới dạng HTML
            msg.setText(htmlContent, "UTF-8", "html");
            // Gửi email
            Transport.send(msg);
            System.out.println("Xác Nhận Đăng Kí tài Khoản SearchHome.SH");
            return true;
        } catch (Exception e) {
            System.out.println("Gặp lỗi trong quá trình gửi email");
            e.printStackTrace();
            return false;
        }
    }

    public static void main(String[] args) {

        Email.sendEmail("vantu.dev@gmail.com", System.currentTimeMillis() + "", "Đây là phần nội dung!");

    }

}
