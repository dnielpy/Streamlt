# 🎥 Streamlt

Streamlt is a web application developed in Java using the Spring Boot framework and Maven as the project management tool. This application allows users to stream videos from a specific folder on their system to any device connected to their router.

## 🌟 Features

- **Video Streaming**: Users can stream videos from a specific folder on their system to any device connected to their router.
- **Simple User Interface**: The application has a simple and easy-to-use user interface.

## 🚀 How to Use

1. **Enter the Folder Path**: On the application's main page, users need to enter the path of the folder containing the videos they want to stream.
2. **Disable VPN or Firewall**: To ensure smooth streaming, it is recommended to disable any active VPN or Firewall.
3. **Copy the Server IP Address**: The application will provide the server's IP address which users need to copy.
4. **Paste the IP Address in the Web Browser**: Users need to paste the copied IP address in the web browser of any device connected to their router to start streaming the videos.

## 💻 Installation

To install and run this application, you'll need to have Java and Maven installed on your system. Then, you can clone this repository and run the project with Maven.

```bash
git clone https://github.com/dnielpy/streamlt.git
cd streamlt
mvn spring-boot:run