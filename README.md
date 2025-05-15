<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8" />  <meta name="viewport" content="width=device-width, initial-scale=1.0"/>

</head>
<body>

  <h1>📝 ToDoApp</h1>
  <p>A simple and powerful ASP.NET Core Web API for managing ToDo tasks. This application demonstrates clean architecture, RESTful API design, and best practices with ASP.NET Core and Entity Framework Core.</p>

  <h2>🚀 Features</h2>
  <ul>
    <li>CRUD operations for ToDo items (Create, Read, Update, Delete)</li>
    <li>RESTful API with clear route conventions</li>
    <li>Clean separation of concerns using Layers (API, Application, Domain, Infrastructure)</li>
    <li>Entity Framework Core for database interaction</li>
    <li>Swagger UI for API documentation and testing</li>
    <li>AutoMapper for DTO mapping</li>
  </ul>

  <h2>🛠️ Technologies Used</h2>
  <ul>
    <li>.NET 6</li>
    <li>ASP.NET Core Web API</li>
    <li>Entity Framework Core</li>
    <li>AutoMapper</li>
    <li>SQL Server / LocalDB</li>
    <li>Swagger (Swashbuckle)</li>
  </ul>

  <h2>📥 Installation</h2>
  <ol>
    <li><strong>Clone the repository</strong>
      <pre><code>git clone https://github.com/IlyaM70/ToDoApp.git
cd ToDoApp</code></pre>
    </li>
    <li><strong>Configure the database connection</strong>
      <ul>
        <li>Open <code>appsettings.json</code> in the root folder.</li>
        <li>Update the <code>DefaultConnection</code> with your SQL Server connection string.</li>
      </ul>
    </li>
    <li><strong>Apply EF Core migrations</strong>
      <pre><code>dotnet ef database update</code></pre>
    </li>
    <li><strong>Run the application</strong>
      <pre><code>dotnet run</code></pre>
      or run using Visual Studio (press <code>F5</code>)
    </li>
  </ol>

  <h2>💻 API Usage</h2>
  <p>Once the API is running, you can test endpoints using Swagger UI:</p>
  <p><strong>Swagger:</strong> <code>https://localhost:{port}/swagger</code></p>

  <h3>Endpoints</h3>
  <ul>
    <li><code>GET /api/todo</code> – Get all ToDo items</li>
    <li><code>GET /api/todo/{id}</code> – Get a specific ToDo item</li>
    <li><code>POST /api/todo</code> – Create a new ToDo item</li>
    <li><code>PUT /api/todo/{id}</code> – Update an existing ToDo item</li>
    <li><code>DELETE /api/todo/{id}</code> – Delete a ToDo item</li>
  </ul>

  <h2>📂 Project Structure</h2>
  <pre><code>ToDoApp/
│
├── ToDo.API/              # API project (controllers, middleware, startup)
├── ToDo.Application/      # Business logic, DTOs, services
├── ToDo.Domain/           # Domain entities and interfaces
├── ToDo.Infrastructure/   # Data access, EF Core DbContext
├── ToDo.sln               # Solution file
└── README.md              # Documentation</code></pre>

</body>
</html>
