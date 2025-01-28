![](https://api.visitorbadge.io/api/VisitorHit?user=toby959&repo=llama31.git&countColor=%234CAF50)

<h1 style="text-align: center;">
    Uso de IA 
    <img src="https://llama-2.ai/wp-content/uploads/2024/03/LLama-3-LLM.jpg" title="Gemini AI" alt="Llama AI" width="55" height="50" style="vertical-align: baseline; margin-bottom: -16px;"/> 
con Spring
</h1>



___
# Descripción 📖
### Uso de Llama 3.1 (versión gratuita)
### El controlador 'ChatController' Este proyecto utiliza un cliente de chat para proporcionar chistes de papá relacionados con computadoras.   
### Endpoint:
```
http://localhost:8000/broma
```
___
# Recursos 👾


| Plugin                      | URL                      |
|-----------------------------|--------------------------|
| spring-boot-starter-web     | https://start.spring.io/ |
| spring-ai-ollama-spring-boot-starter | https://start.spring.io/ |


___
# Herramientas utilizadas 🛠️

<img src="https://www.vectorlogo.zone/logos/java/java-icon.svg" title="Java"  alt="Java" width="40" height="40"/>&nbsp;
<img src="https://www.vectorlogo.zone/logos/springio/springio-ar21.svg" title="Spring"  alt="Spring" width="40" height="40"/>&nbsp;
<img src="https://llama-2.ai/wp-content/uploads/2024/03/LLama-3-LLM.jpg" title="Llama AI" alt="Llama AI" width="40" height="40"/>&nbsp;
<img src="https://www.vectorlogo.zone/logos/git-scm/git-scm-icon.svg" title="Git"  alt="Git" width="40" height="40"/>&nbsp;
<img src="https://www.vectorlogo.zone/logos/github/github-icon.svg" title="GitHub"  alt="GitHub" width="40" height="40"/>&nbsp;


![Badge en Desarollo](https://img.shields.io/badge/STATUS-EN%20DESAROLLO-4d0211)&nbsp;&nbsp;&nbsp;![Java 21](https://img.shields.io/badge/java-21-337187?logo=java)&nbsp;![Badge llama3.1](https://img.shields.io/badge/IA-llama3.1-808000)&nbsp;&nbsp;![Version](https://img.shields.io/badge/version-v1.0-7a0099)&nbsp;&nbsp;&nbsp;[![MIT License](https://img.shields.io/badge/licencia-MIT-f5ce9f.svg)](LICENSE)&nbsp;&nbsp;&nbsp;![IntelliJ IDEA Community](https://img.shields.io/badge/IDE-IntelliJ%20IDEA%20Community-4304b0?style=flat)&nbsp;&nbsp;&nbsp;
___

# Pasos a seguir descargar la versión de Llama 3.1

☑️ Llama: Abre la url [Visita Llama.com](https://www.llama.com/)

# Leer la Documentación

☑️ Llama: Abre la url [Visita Llama.library](https://ollama.com/library/llama3.1:8b)

# Tener en cuenta la version que deseas descargar.

☑️ Llama: Abre la url [Visita Ollama.com](https://ollama.com/)

# Crear la API KEY

☑️ Gemini Developer API: Abre la url [Visita Gemini apikey](https://aistudio.google.com/apikey)



👁️ Además agregar en nuestro archivo **application.properties** o **application.yaml**
``` bash
gemini.api.url=${GEMINI_API_URL}
gemini.api.key=${GEMINI_API_KEY}
```
___
# Para Postman el cuerpo de json es:
````
{
    "question": "aqui va la pregunta?"
}
````
# El endpoint es:
````
http://localhost:8000/api/qna/ask
````
___
# Extras
Usamos VSC para nuestro frontend, donde abrimos la terminal en ingresamos:
````bash
npm create vite@latest
````
Luego le damos un nombre a nuestro proyecto:
````bash
gemini-chat-frontend
````
Seleccionamos el framework:
````bash
React
````
Seleccionamos la variante:
````bash
JavaScript
````
Luego nos posicionamos en nuestro archivo recien creado:
````bash
cd gemini-chat-frontend
````
Desde allí ingresamos por la terminal:
````bash
npm install
````
Una vez que se descargan los archivos, ingresamos para levantar el proyecto:
````bash
npm run dev
````
Seguidamente ejecutamos en la terminal:
````bash
npm i bootstrap@5.3.3
````
Debemos leer la documentación de bootstrap: [Visita Bootstrap docs](https://getbootstrap.com/docs/5.3/getting-started/introduction/)   
En nuestro nuevo proyecto, al archivo *main.jsx*  debemos agregar:
````bash
import bootstrap/dist/css/bootstrap.min.css
````
Y borrar el contenido css de los archivos: *index.css* y *App.css*   
Al archivo *main.jsx* le borramos todo el codigo css y agregamos un componente bootstrap:
````bash
<button type="button" class="btn btn-primary">Primary</button>
````

Comenzar a crear el contenido del frontend en App.jsx   
Crear un archivo en 'src' de nombre:
````
components/ChatInput.jsx/ChatResponse.jsx
````
Agregar al archivo ChatInput:
````
export default ChatInput;
````
Agregar al archivo ChatResponse:
````
export default ChatResponse;
````
Luego importarlos al archivo App.jsx:
````
import ChatInput from ./components/ChatInput
import ChatResponse from ./components/ChatResponse
````
Debemos tener en cuenta que el modelo de Gemini es el siguiente:
````
Modelo:
{
  "candidates": [
    {
      "content": {
        "parts": [
          {
            "text": "Soy un modelo de lenguaje grande, entrenado por Google."
          }
        ],
        "role": "model"
      },
      "finishReason": "STOP",
      "avgLogprobs": -0.0022162771783769131
    }
  ],
  "usageMetadata": {
    "promptTokenCount": 4,
    "candidatesTokenCount": 12,
    "totalTokenCount": 16
  },
  "modelVersion": "gemini-1.5-flash"
}
````

Por ultimo debemos instalar desde la terminal:
``` 
npm install axios
```
Crear desde ´src´ la carpeta:
``` 
services/api.jsx
```
Para concluir el proyecto solo queda agregar a nuestro intelliJ:
# Configuración de CORS
La función 'addCorsMappings' se utiliza para configurar las reglas de CORS (Cross-Origin Resource Sharing) en una aplicación Spring. CORS es un mecanismo que permite que recursos restringidos en una página web se soliciten desde otro dominio distinto al que sirvió el recurso inicial.

# Método: 'addCorsMappings'
````
java
@Override
public void addCorsMappings(CorsRegistry registry) {
registry.addMapping("/**")
.allowedOrigins("http://localhost:5173")
.allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
.allowedHeaders("*")
.allowCredentials(true);
}
````
# Descripción
* 'addCorsMappings(CorsRegistry registry)': Este método se encarga de definir las configuraciones de CORS para la aplicación.

# Parámetros
* 'CorsRegistry registry': Un objeto que permite registrar las configuraciones de CORS.

# Configuraciones Específicas

* 'registry.addMapping("/**")': Permite que todas las rutas de la aplicación respondan a solicitudes CORS.
* '.allowedOrigins("http://localhost:5173")': Especifica que solo se permiten solicitudes CORS desde el origen http://localhost:5173. Esto es útil durante el desarrollo para permitir que una aplicación frontend en esa dirección acceda a los recursos del backend.
* '.allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")': Define los métodos HTTP permitidos para las solicitudes CORS. En este caso, se permiten los métodos GET, POST, PUT, DELETE y OPTIONS.
* '.allowedHeaders("*")': Permite cualquier encabezado en las solicitudes CORS. Esto significa que no hay restricciones sobre qué encabezados pueden ser enviados en la solicitud.
* '.allowCredentials(true)': Indica que se permiten credenciales (como cookies o autenticación HTTP) en las solicitudes CORS. Esto es importante si tu aplicación necesita manejar sesiones o autenticación.

# Uso
Este método debe ser implementado en una clase de configuración de Spring, generalmente anotada con '@Configuration', para que las configuraciones de CORS sean aplicadas a toda la aplicación.
# Ejemplo de Implementación
````
java
@Configuration
public class WebConfig implements WebMvcConfigurer {
@Override
public void addCorsMappings(CorsRegistry registry) {
registry.addMapping("/**")
.allowedOrigins("http://localhost:5173")
.allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
.allowedHeaders("*")
.allowCredentials(true);
}
}
````
___


# Crear la API KEY de Weatherapi

☑️ Weatherapi: Abre la url [Visita Weatherapi.com](https://www.weatherapi.com/)    

Agregamos al archivo application.properties:
````
weather.api-key=${WEATHER_API_KEY}
weather.api-url=https://api.weatherapi.com/v1
````
# El endpoint de ejemplo es:
````
http://localhost:8000/cities?message=What%20is%20the%20current%20weather%20like%20in%20Villa%20Carlos%20Paz%20Corboda%20Argentina?
````
# Observaciones se debe agregar al 'main' [ ]:
````
[@EnableConfigurationProperties(WeatherConfigProperties.class)]
@SpringBootApplication
public class Llama31Application {

	public static void main(String[] args) {
		SpringApplication.run(Llama31Application.class, args);
	}

}
````

___
# Imagenes:
![Imagen frontend](imagen-frontend.png)
___
# Observación, para poder hacer uso se debe levantar el servicio de intelliJ y en VSC desde la terminal se debe iniciar mediante el comando:
````
npm run dev
````
# Si el IDE no toma algún constructor realizar:
````
Desde el panel ir a 'setting' => Build, Execution.Deployment => Annotation Process => seleccionar el proyecto 'gemini-chat' => tildar la opción Obtain Processors from project classpath = > 'ok'
````
___
# Ejecutar el Proyecto ⚙️
1 - Clona el repositorio en tu máquina local
``` bash
git clone
<https://github.com/toby959/gemini-chat.git>
```
2 - Compila y ejecuta el archivo GeminiChatAplication.java
___


# Colaboraciones 🎯
Si deseas contribuir a este proyecto, por favor sigue estos pasos:

1 - Haz un fork del repositorio: Crea una copia del repositorio en tu cuenta de GitHub.
2 - Crea una nueva rama: Utiliza el siguiente comando para crear y cambiar a una nueva rama:
```bash
git chechout -b feature-nueva
```
3 - Realiza tus cambios: Implementa las mejoras o funcionalidades que deseas agregar.
4 - Haz un commit de tus cambios: Guarda tus cambios con un mensaje descriptivo:
```bash
git commit -m 'Añadir nueva funcionalidad'
```
5 - Envía tus cambios: Sube tu rama al repositorio remoto:
````bash
git push origin feature-nueva
````
6 - Abre un pull request: Dirígete a la página del repositorio original y crea un pull request para que revisemos tus cambios.

💥Gracias por tu interés en contribuir a este proyecto. ¡Esperamos tus aportes!
___

## Licencia 📜

#### Este proyecto está licenciado bajo la Licencia MIT - ver el archivo [LICENSE](https://github.com/toby959/gemini-chat/blob/main/LICENSE) para más detalles.