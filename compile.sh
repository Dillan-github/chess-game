echo "Compiling chess-game..."

cd chess
(mvn clean package)
cd ..

echo "Finished compiling"