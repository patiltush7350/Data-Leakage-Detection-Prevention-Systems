# 🚀 Data Loss Prevention (DLP) System

Welcome to the Data Loss Prevention (DLP) System repository! This project is designed to monitor and manage data security, offering functionalities to detect and prevent potential data leaks.

## Components

The following components constitute this project:

- 🌐 **ApiGateway**: Serves as the central entry point for client requests, efficiently routing them to the appropriate services.
- ⚙️ **ConfigServer**: Centralizes configuration management for various services, simplifying setup and maintenance.
- 🔍 **ServiceRegistry**: Offers service discovery and registration capabilities for services, ensuring seamless communication.
- 📊 **DashboardService**: Provides a user interface for monitoring and managing data security, including viewing logs and alerts.
- 🏢 **LogService**: Manages the collection, storage, and retrieval of data transfer logs.
- 🚨 **AlertService**: Detects potential data leaks and issues alerts.

## Installation and Setup

To run the DLP system locally, follow these steps:

1. 📥 **Clone this repository** to your local machine:

   ```sh
   git clone https://github.com/yourusername/dlp-system.git
   cd dlp-system
   ```

2. 💻 **Ensure you have Java Development Kit (JDK) installed**.

3. 🛠️ **Navigate to each service directory** (e.g., ApiGateway, ConfigServer, etc.) and follow the setup instructions provided in their respective README files.

4. 🏃‍♂️ **Run the services**:

   - Start the ConfigServer.
   - Start the ServiceRegistry.
   - Start the ApiGateway.
   - Start the LogService.
   - Start the AlertService.
   - Start the DashboardService.

5. 🚀 **Access the Dashboard**:

   Open your browser and navigate to [http://localhost:8080/home](http://localhost:8080/home) to interact with the system.

## Usage

After setting up the DLP system, you can utilize the dashboard to monitor data transfers, view logs, receive alerts about potential data leaks, and manage settings. Interaction with the system can be done via HTTP requests to the appropriate endpoints exposed by each service.

## Example Endpoints

- **Logs**: `GET /logs`
- **Alerts**: `GET /alerts`
- **Settings**: `GET /settings`
- **Dashboard**: `GET /home`

## Need Help?

If you have any questions or need assistance regarding this project, feel free to contact me:

- **LinkedIn**: [www.linkedin.com/in/tusharpatil1210](https://www.linkedin.com/in/tusharpatil1210)
- **Phone Number**: 7350979271
