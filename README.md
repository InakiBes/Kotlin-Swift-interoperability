# Compose Swift Bridge Demo

This repository is a practical demonstration of how to integrate Compose Multiplatform components with native views on iOS using the Compose Swift Bridge. It follows the principles outlined in Touchlab's tutorial to implement a solution that combines the best of Kotlin and SwiftUI, enabling the creation of cross-platform apps with an optimized native experience on each platform.

**Touchlab Tutorial:** [https://touchlab.co/composeswiftbridge/tutorial](https://touchlab.co/composeswiftbridge/tutorial)

---

### Features

- **Multiplatform setup**: Use KSP and SKIE to automatically generate the necessary interfaces between Kotlin and Swift.
- **SwiftUI compatibility**: Practical example of a `SimpleTextView` component.
- **Real-time state management**: Implementation of `ObservableObject` to keep Compose states synchronized with native SwiftUI views.

---

### Objective

This project is designed to help developers:

- Configure and use the Compose Swift Bridge plugin in their Kotlin Multiplatform projects.
- Build cross-platform components that leverage customization and native performance on iOS.
- Learn how to work with annotations like `@ExpectSwiftView` to automatically generate the required implementations for iOS.  