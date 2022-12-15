# Demo project with two database in MariaDB and JPA    

## Start database

    docker run -d -p3306:3306 --env MARIADB_USER=user --env MARIADB_PASSWORD=user \
                --env MARIADB_ROOT_PASSWORD=root --env MARIADB_DATABASE=one mariadb:latest
