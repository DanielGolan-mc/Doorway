# Doorway
*An experimental Discord API wrapper library written in Java. Overusing builders since 2022.*
### Why should I use Doorway?
- the syntax is imrpoved over other wrappers like JDA.
- Doorway doesn't use any external libraries at all, and only uses Java's built-in classes, providing improved Security.
- the installation is simple, and only requires your bot's public key.
- We do not support discord gateway, which heavily improves performance and network usage.
- Doorway handles errors automatically, and will send the user info about an error and why it happened. You can also use this system yourself!
  - You can customize this behavior.
- Doorway supports inserting parameters for components, for example saving an `authorID` parameter in a delete button, and only allowing the user saved in the button to use it!
  - these parameters aren't cached, but saved in the button's custom ID (which is why you can't use the `?`, `,` and `=` characters in custom IDs), and can be viewed publicly. Just a warning!
### Why shouldn't I use Doorway?
- Doorway currently only supports interactions.
  - Because of this, new features are mainly gated behind Discord implementing new interaction types.
- Doorway is mainly a proof-of-concept, and a library I'm making for myself, publishing only to help others not go through what I do developing this library. Features are prioritized appropriately.
  - If you want us to implement a new built-in event handler, or support a discord feature, just create an issue! We'll know you want it and priotize your request.
