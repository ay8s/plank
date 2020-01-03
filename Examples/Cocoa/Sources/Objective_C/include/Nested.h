//
// Nested.h
// Autogenerated by Plank (https://pinterest.github.io/plank/)
//
// DO NOT EDIT - EDITS WILL BE OVERWRITTEN
// @generated
//

#import <Foundation/Foundation.h>
#import "PlankModelRuntime.h"
@class NestedBuilder;

NS_ASSUME_NONNULL_BEGIN

@interface Nested : NSObject<NSCopying, NSSecureCoding>
@property (nonatomic, assign, readonly) NSInteger identifier;

+ (NSString *)className;
+ (NSString *)polymorphicTypeIdentifier;
+ (instancetype)modelObjectWithDictionary:(NSDictionary *)dictionary;
- (instancetype)initWithModelDictionary:(NS_VALID_UNTIL_END_OF_SCOPE NSDictionary *)modelDictionary;
- (instancetype)initWithBuilder:(NestedBuilder *)builder;
- (instancetype)initWithBuilder:(NestedBuilder *)builder initType:(PlankModelInitType)initType;
- (instancetype)copyWithBlock:(PLANK_NOESCAPE void (^)(NestedBuilder *builder))block;
- (BOOL)isEqualToNested:(Nested *)anObject;
- (instancetype)mergeWithModel:(Nested *)modelObject;
- (instancetype)mergeWithModel:(Nested *)modelObject initType:(PlankModelInitType)initType;
- (NSDictionary *)dictionaryObjectRepresentation;
- (BOOL)isIdentifierSet;
@end

@interface NestedBuilder : NSObject
@property (nonatomic, assign, readwrite) NSInteger identifier;

- (instancetype)initWithModel:(Nested *)modelObject;
- (Nested *)build;
- (void)mergeWithModel:(Nested *)modelObject;
@end

NS_ASSUME_NONNULL_END
