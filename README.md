# SprintWeatherAPI
Мы хотим создать API, которое будет проксировать запросы к WeatherAPI и отдавать пользователю по REST API в формате JSON информацию о погоде.


Мы хотим дать пользователю несколько вариантов использования API:

Пользователь не передает никаких параметров. В таком случае определяется его IP и этот IP предается в WeatherAPI

Пользователь сам передает свой IP через параметр. В данном случае его IP игнорируется

Пользователь передает название города
