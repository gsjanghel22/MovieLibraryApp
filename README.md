# MovieLibraryApp
'MovieFlix' is an online Movie Library App
<p>This application enables the users to view the details of movies based on some search options.<br><br>
  It also allows the admin to add new movies.
</p>
  <br>
  <b>This application supports two types of users:-</b>
  <ol>
    <li><b>User:</b> Can only perform searches to view the details of movies. There is no login required for the user.</li><br>
    <li><b>Admin:</b> Can add movies with the details, also the admin has the option to modify movie details. But that should display as functionality not available yet, still in progress.</li>
  </ol>

  <p>The home screen enables the users to search for movies, based on any of the 3 criteria i.e., based on a movie id, based on a movie name or based on the collection range that the movie has earned.<br><br>
    User clicks on <u>by Movie ID</u>, <u>by Movie Name</u>, or <u>by Movie Collection</u> to find details about the movie.
    <br><br>
  </p>

  <p>
        <b>Initial Database/Table Structure:-</b>
        <br>
        <table>
          <tr>
            <th>MovieID</th>
            <th>MovieName</th>
            <th>Collection</th>
          </tr>
          <tr>
            <td>M001</td>
            <td>The Mummy</td>
            <td>3000000</td>
          </tr>
          <tr>
            <td>M002</td>
            <td>The Firm</td>
            <td>2000000</td>
          </tr>
          <tr>
            <td>M003</td>
            <td>Mr Bean</td>
            <td>2500000</td>
          </tr>
          <tr>
            <td>M004</td>
            <td>Logan</td>
            <td>2500000</td>
          </tr>
          <tr>
            <td>M005</td>
            <td>Avengers: Age Of Ultron</td>
            <td>6000000</td>
          </tr>
          <tr>
            <td>M006</td>
            <td>Topgun</td>
            <td>2000000</td>
          </tr>
          <tr>
            <td>M007</td>
            <td>Moana</td>
            <td>4000000</td>
          </tr>
          <tr>
            <td>M008</td>
            <td>Finding Nemo</td>
            <td>5500000</td>
          </tr>
          <tr>
            <td>M009</td>
            <td>The Mummy Returns</td>
            <td>9000000</td>
          </tr>
          <tr>
            <td>M010</td>
            <td>Star Wars</td>
            <td>7000000</td>
          </tr>
        </table>
      </p>
      <br>

<p>
  <b>Technologies majorly used in the project:-</b>
  <br><br>
  <b>Languages & Frameworks:</b> JAX RS, Spring Boot, Spring Data<br><br>
  <b>Database:</b> H2 an in-memory database for Spring Boot<br><br>
  <b>Build Tool:</b> Used and Implemented as a Maven based Spring Boot Project.
</p>
