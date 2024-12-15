# Behavioral Design Pattern - Strategy

## 🎨 Overview

**`Strategy Pattern`** :
بيجمع شوية خوارزميات (طرق حل المشكلة)، ويحط كل واحدة في كلاس لوحدها بحيث تبقى قابلة للتبديل مع بعضها. يعني بدل ما تبقى الطريقة اللي الكود شغال بيها ثابتة وما تتغيرش، بتقدر تغيرها بسهولة من غير ما تلعب في الكود بتاع العميل اللي بيستخدمها.

## Overview of the Strategy Pattern

تعالوا نبدء بسيستم كده، عبارة عن لعبة فيها كل أنواع البط وكل بطة بتعمل شوية حاجات فاللعبة دي
![Photo-1](https://github.com/user-attachments/assets/439f9e1b-6edc-4678-b6de-810a22b9462f)

## Defining the Strategy Interface

حلو يبقا احنا دلوقت عندنا سوبر كلاس اسمه duck في اتنين كلاس بيورثوا منه لحد كده الدنيا جميلة البط بيعرف يسبح او بيعرف يعمل quack
وحاطين كل دا فال السوبر كلاس وبنعمل override فال subtype classes عشان ينفذوها بالطريقة اللي عاوزينها
![Photo-2](https://github.com/user-attachments/assets/80adb74d-53e6-41dc-a037-bafe0d36655e)

## Creating Concrete Strategies

ظهر فانكشن جديدة هنا، طيب كده اي كلاس هيورث من كلاس ال duck
هيكون قادر يطير هنا تظهر المشكلة بقا وهي ان ممكن في بط مش بيقدر بس بيعمل الاوبريشنز التانية عادي لو بصيت عالصورة الجاية هتلاقي
rubber duck مش بيقدر يطير
![Photo-3](https://github.com/user-attachments/assets/830671be-0179-48d5-8c96-45029c62ff64)

## Implementing the Context Class

يبقا كده من الواضح أن لازم افصل ال Behaviors
في حتة تانية وكمان السيستم بدا يكبر كده للدرجة اللي تخلي الوراثة لوحدها مش كفاية ولازم نبدء نستعمل ال interface
طيب هنتصرف ازاي في حاجة زي دي بسيطة احنا هنحط كل ال Behaviors
المشتركة في الكلاس الكبير (parent)
والحاجات الباقية هنفصلها في interfaces
![Photo-4](https://github.com/user-attachments/assets/6699bf0d-4a39-461b-8bf4-3e35db99df37)

## Injecting a Strategy into the Context

طيب احنا هنا نقلنا كل ال methods
المشتركة في ال parent class
وال methods
التانية فصلناها في interface
واللي عاوزها يقدر ياخدها ويعمل لها implement
بس هنا في مشكلة وهي duplicate code
نفترض دلوقت عندك 20 نوع بط بيعمل quack
بنفس الطريقة هتروح عند ال 20 class
تعمل نفس ال implementation
ممكن نروح نعمل class
يورث هو من ال interface
وينفذ ال implementation
واللي عاوز نفس ال implementation
يروح يورث منه وخلاص
![Photo-5](https://github.com/user-attachments/assets/c2277bcd-a06d-434c-8336-f1465b430407)

## Final Implementation of the Strategy Pattern

بس كده لو احتاجنا نغير في حاجة هنغير بمنتهي السهولة لاننا بقا معني صورة واضحة عن اللي بيحصل واقدر اعدل او أضيف فيه ازاي واخيرا دي الصورة الأخيرة للي احنا عملناه
![Photo-6](https://github.com/user-attachments/assets/912f09ba-8695-4af4-b375-20992b59f9cd)
