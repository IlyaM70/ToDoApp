<h1>📝 ToDoApp</h1>
<p>A simple ToDo list application built using Spring Boot. This project allows users to manage their tasks efficiently with basic functionalities.</p>

<h2>🚀 Features</h2>
<ul>
  <li>Create, Read, Update, and Delete (CRUD) operations for ToDo items</li>
  <li>RESTful API endpoints</li>
  <li>Integration with a relational database using Spring Data JPA</li>
</ul>

<h2>🛠️ Technologies Used</h2>
<ul>
  <li>Java</li>
  <li>Spring Boot</li>
  <li>Spring Data JPA</li>
  <li>H2 Database (for development and testing)</li>
  <li>Maven (for project management and build)</li>
</ul>

<h2>📥 Installation</h2>
<ol>
  <li><strong>Clone the repository</strong>
    <pre><code>git clone https://github.com/IlyaM70/ToDoApp.git
cd ToDoApp</code></pre>
  </li>
  <li><strong>Build the project using Maven</strong>
    <pre><code>mvn clean install</code></pre>
  </li>
  <li><strong>Run the application</strong>
    <pre><code>mvn spring-boot:run</code></pre>
  </li>
</ol>

<h2>💻 Usage</h2>
<p>Once the application is running, you can interact with the ToDo API using tools like Postman or cURL.</p>

<h3>API Endpoints</h3>
<ul>
  <li><code>GET /api/todos</code> – Retrieve all ToDo items</li>
  <li><code>GET /api/todos/{id}</code> – Retrieve a specific ToDo item by ID</li>
  <li><code>POST /api/todos</code> – Create a new ToDo item</li>
  <li><code>PUT /api/todos/{id}</code> – Update an existing ToDo item</li>
  <li><code>DELETE /api/todos/{id}</code> – Delete a ToDo item</li>
</ul>
