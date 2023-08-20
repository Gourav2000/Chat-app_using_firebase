# Chat Application using Firebase

This is a basic chat application for Android, built using Firebase as the backend service.

## Table of Contents
- [Features](#features)
- [Getting Started](#getting-started)
- [Usage](#usage)
- [Screenshots](#screenshots)
- [Contributing](#contributing)
- [License](#license)

## Features
- **Firebase Realtime Database**: Used for storing and retrieving real-time chat data.
- **Firebase Authentication**: Provides user authentication using email and password.
- **Firebase Storage**: Used for storing user profile images and other media.

## Getting Started
1. Create an account on the Firebase console. If you have a Google account, you can use it; otherwise, you'll need to create one.
2. Create a new project on Firebase and link your Android app.
3. Download the `google-services.json` file from Firebase and place it in the app directory of the project.

**Note**: Ensure that you enable the email sign-in option in the Firebase authentication section of the Firebase console.

## Usage
### Login
Users can log in using their registered email and password. There's also an option to reset the password if forgotten.

### Registration
New users can register by providing a username, email, and password.

### Main Chat Interface
- Users can view their chats, a list of all users, and their profile.
- Users can send and receive messages in real-time.
- The chat interface displays the online/offline status of users.

## Screenshots
(You can add screenshots of the app here)

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

## License
This project is licensed under the [MIT License](LICENSE).
