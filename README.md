# Movie App  

##  Overview  
The **Movie App** is an Android application that fetches real-time movie data using the [MoviesAPI.ir](https://moviesapi.ir/) REST API.  
It provides users with the latest and upcoming movies in a simple, clean, and user-friendly interface.  

---

##  Features  
-  Browse latest movies  
-  Explore upcoming movies  
-  View movie details (poster, title, rating, etc.)  
-  Smooth & responsive UI with RecyclerView  
-  REST API integration (MoviesAPI.ir)  

---

##  Tech Stack  
- **Language:** Java  
- **Framework:** Android (Android Studio)  
- **UI:** XML (Material Design)  
- **Libraries & Tools:**  
  - Volley → API Requests  
  - Gson → JSON Parsing  
  - Glide → Image Loading  
  - RecyclerView & CardView → UI Components  

---

##  API Used  
The app uses **[MoviesAPI.ir](https://moviesapi.ir/)** – a free REST API for movie data.  

Example requests:  
```http
GET https://moviesapi.ir/api/v1/movies?page=1
GET https://moviesapi.ir/api/v1/movies?page=3


---

##  Screenshots  

###  Home Screen  
<img src="https://github.com/user-attachments/assets/380a016c-70e5-4f57-a537-cb8e85e17286" width="300"/>  

###  Movie List  
<img src="https://github.com/user-attachments/assets/49c1604a-0d28-4960-801a-b85f614ffdb0" width="300"/>  

###  Movie Details  
<img src="https://github.com/user-attachments/assets/66733f32-0395-4214-933d-42e1bfb20357" width="300"/>  

###  Favorites Section  
<img src="https://github.com/user-attachments/assets/88e90f4e-d643-434f-8554-a7f79155f7ed" width="300"/>  

---

##  Installation & Setup
1. Clone this repository  
   ```bash
   git clone https://github.com/vishakha-ye/Movie-App.git
