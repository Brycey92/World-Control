echo "Setting up Eclipse development environment with gradle..."
rmdir /s /q .\build
call gradlew.bat wrapper --gradle-version 4.4.1
call gradlew.bat setupDecompWorkspace eclipse --refresh-dependencies

echo "Setup Complete."
pause