import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class RegisterFormGUI extends JFrame {

    private static Map<String, String> userData = new HashMap<>();

    public static void main(String[] args) {
        showRegistrationScreen();
    }

    public static void showRegistrationScreen() {
        JFrame frame = new JFrame("User Registration");
        frame.setSize(750, 280);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel titleLabel = new JLabel("New User Register");
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        titleLabel.setBounds(250, 10, 200, 25);
        frame.add(titleLabel);

        JLabel firstNameLabel = new JLabel("First name");
        firstNameLabel.setBounds(50, 50, 100, 25);
        frame.add(firstNameLabel);

        JTextField firstNameField = new JTextField();
        firstNameField.setBounds(150, 50, 200, 25);
        frame.add(firstNameField);

        JLabel lastNameLabel = new JLabel("Last name");
        lastNameLabel.setBounds(50, 90, 100, 25);
        frame.add(lastNameLabel);

        JTextField lastNameField = new JTextField();
        lastNameField.setBounds(150, 90, 200, 25);
        frame.add(lastNameField);

        JLabel emailLabel = new JLabel("Email address");
        emailLabel.setBounds(50, 130, 100, 25);
        frame.add(emailLabel);

        JTextField emailField = new JTextField();
        emailField.setBounds(150, 130, 200, 25);
        frame.add(emailField);

        JLabel usernameLabel = new JLabel("Username");
        usernameLabel.setBounds(400, 50, 100, 25);
        frame.add(usernameLabel);

        JTextField usernameField = new JTextField();
        usernameField.setBounds(500, 50, 200, 25);
        frame.add(usernameField);

        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(400, 90, 100, 25);
        frame.add(passwordLabel);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(500, 90, 200, 25);
        frame.add(passwordField);

        JLabel mobileLabel = new JLabel("Mobile number");
        mobileLabel.setBounds(400, 130, 100, 25);
        frame.add(mobileLabel);

        JTextField mobileField = new JTextField();
        mobileField.setBounds(500, 130, 200, 25);
        frame.add(mobileField);

        JButton registerButton = new JButton("Register");
        registerButton.setBounds(50, 180, 100, 25);
        frame.add(registerButton);

        JButton loginButton = new JButton("login");
        loginButton.setBounds(600, 180, 100, 25);
        frame.add(loginButton);

        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String firstName = firstNameField.getText();
                String lastName = lastNameField.getText();
                String email = emailField.getText();
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());
                String mobile = mobileField.getText();

                if (!firstName.isEmpty() && !lastName.isEmpty() && !email.isEmpty() &&
                        !username.isEmpty() && !password.isEmpty() && !mobile.isEmpty()) {
                    userData.put(username, password);
                    JOptionPane.showMessageDialog(frame, "Welcome, " + firstName + "\nYour account is successfully created");

                    // Không vô hiệu hóa nút login nữa
                } else {
                    JOptionPane.showMessageDialog(frame, "Please fill in all fields", "Warning", JOptionPane.WARNING_MESSAGE);
                }
            }
        });

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                showLoginScreen();
            }
        });

        frame.setVisible(true);
    }

    public static void showLoginScreen() {
        JFrame frame = new JFrame("User Login");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel titleLabel = new JLabel("Login");
        titleLabel.setBounds(170, 10, 100, 25);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 16));
        frame.add(titleLabel);

        JLabel usernameLabel = new JLabel("Username");
        usernameLabel.setBounds(50, 50, 100, 25);
        frame.add(usernameLabel);

        JTextField usernameField = new JTextField();
        usernameField.setBounds(150, 50, 200, 25);
        frame.add(usernameField);

        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(50, 90, 100, 25);
        frame.add(passwordLabel);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(150, 90, 200, 25);
        frame.add(passwordField);

        JButton loginButton = new JButton("login");
        loginButton.setBounds(150, 130, 100, 25);
        frame.add(loginButton);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                if (userData.containsKey(username) && userData.get(username).equals(password)) {
                    JOptionPane.showMessageDialog(frame, "You have successfully logged in");
                } else {
                    JOptionPane.showMessageDialog(frame, "Invalid credentials", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        frame.setVisible(true);
    }
}